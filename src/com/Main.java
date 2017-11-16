package com;

import com.BusinessLogic.Dao;
import javafx.util.Pair;

import javax.swing.*;
import java.io.*;

import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * "This app process json files and writes tsv files based on Sherlock project.\n\n Click OK to choose directory"
 */
public class Main {

    private static Logger logger = Logger.getLogger("");
    private static String[] tableNames = {"Allbroadcastprobe",
            "Application",
            "Apppackages",
            "Bluetooth",
            "Broswersearches",
            "Call",
            "Chromebookmarks",
            "Errorsensor",
            "Moriartyprobe",
            "Screenon",
            "Sms",
            "T0",
            "T1",
            "T2",
            "T3",
            "T4",
            "Userpresentprobe",
            "Wifi"};


    static final int QUEUE_LIMIT = 1000;
    static final int EXIST_IN_MAP_DURATION = 5000; // x/1000 - time in sec for an item in map to stay before output it.
    private static final long LEAST_USABLE_SPACE = 10737418240L;
    private static String JSONPATH;
    private static String OUTPUTPATH = "outputTSV";
    private static final long OVERLAP_MILISECONDS = 345600000L; //equal to 4 days.

    private static boolean shouldLimitUUIDRange = true;
    private static long uuidRestrictionMax = 0;
    private static long uuidRestrictionMin = 0;
    static String outputQFolder;

    public static void main(String[] args) throws IOException, InterruptedException {


        if (args.length < 5) {
            System.out.println("usage: [shouldLimit] (y/n) [uuidMin] (inclusive) [uuidMax] (exclusive) [outputQFolder] [InputFolder]");
            return;
        }


        if (args.length == 5 && args[0].equals("y")) {
            shouldLimitUUIDRange = true;
            uuidRestrictionMin = Long.parseLong(args[1]);
            uuidRestrictionMax = Long.parseLong(args[2]);
            outputQFolder = args[3];
            JSONPATH = args[4];
        }

        System.out.println("**************************************************************************");
        System.out.println("shouldLimitUUIDRange = " + shouldLimitUUIDRange);
        System.out.println("uuidRestrictionMin = " + uuidRestrictionMin);
        System.out.println("uuidRestrictionMax = " + uuidRestrictionMax);
        System.out.println("outputQFolder = " + outputQFolder);
        System.out.println("JSONPATH = " + JSONPATH);
        System.out.println(" \nopening J panel to choose a directory..");

        start(init());


    }


    private static ConcurrentHashMap[] tableHashMaps;
    private static CountDownLatch processLatch;
    private static CountDownLatch writeLatch;
    private static AtomicBoolean isMainThreadSleep;
    private static AtomicBoolean isReadAllFiles;
    private static Dao dao;
    private static int nProcessThreads;
    private static AtomicInteger dataQueueCounter;
    private static ConcurrentLinkedQueue<Pair<String, String>> dataQueue;

    public static void start(File[] listOfFiles) {
        try {

            final long startTime = System.currentTimeMillis();
            // pair holds username and data itself - json line.
            dataQueue = new ConcurrentLinkedQueue<>();
            dataQueueCounter = new AtomicInteger(0);
            isMainThreadSleep = new AtomicBoolean(false);
            isReadAllFiles = new AtomicBoolean(false);
            nProcessThreads = 16; //TODO: SEE EFFICIENCY

            processLatch = new CountDownLatch(nProcessThreads);
            writeLatch = new CountDownLatch(tableHashMaps.length);

            createOutputDoneFolders();

            Thread[] processThreads = new Thread[nProcessThreads];
            Thread[] writeThreads = new Thread[tableHashMaps.length];

            createProcessThreads(processThreads);
            createWriteThreads(writeThreads);

            //logger.info("Main: started to Read all files total: " + listOfFiles.length);
            //Read all the files
            int countLines = 0;


            System.out.println("Time start:  " + DateFormat.getInstance().format(System.currentTimeMillis()));

            //filter the array to get only the files which where created in a WEEK before and after the set UUID.
            File[] filterdFiles = Arrays.stream(listOfFiles).filter(Main::isFileBetweenWeekRangeUUID).toArray(File[]::new);

            listOfFiles = filterdFiles; //switch between them.
            System.out.println("Files filtered between set uuidMin-Week to uuidMax+Week :: | number of filterdFiles: " + filterdFiles.length);


            //read each file (skip directories) and add it to dataQueue.
            for (int i = 0; i < listOfFiles.length; i++) {

                //if disk space free is less than 10GB
                //break
                File currFile = listOfFiles[i].getAbsoluteFile();
                boolean shouldExitNoSpace = checkUsableSpace();//

                if (shouldExitNoSpace) {
                    System.out.println("shouldExitNoSpace");
                    for (Thread x : processThreads) {
                        x.interrupt();
                    }

                    //  should do it?
                    for (Thread x : writeThreads) {
                        x.interrupt();
                    }
                    break;
                }

                if (currFile.isFile()) {

                    try (FileReader fileReader = new FileReader(currFile)) {
                        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                            String line;
                            String userName = currFile.getName().substring(0, 10);
                            if (userName.contains("_")) { //
                                userName = "noName";
                            }
                            //Read line by line and insert to queue
                            while ((line = bufferedReader.readLine()) != null) {
                                //    buf

                                //name changing
                                if (userName.equals("4abe40d011"))//Shoshanna old change to new one
                                    userName = "65f42fb278";
                                if (userName.equals("f0e4901c25"))//Ester Old change to new one
                                    userName = "dd25a68e9e";

                                Pair<String, String> userAndLine = new Pair<>(userName, line);


                                //limit dataQueue to QUEUE_LIMIT items.
                                if (dataQueueCounter.get() > QUEUE_LIMIT) {
                                    synchronized (dataQueue) {
                                        while (dataQueueCounter.get() > QUEUE_LIMIT) {
                                            isMainThreadSleep.set(true);
                                            dataQueue.wait();
                                        }
                                    }
                                    isMainThreadSleep.set(false);
                                }

                                dataQueueCounter.incrementAndGet();
                                dataQueue.add(userAndLine);

                                if (countLines % 1000 == 0) {
                                    System.out.println("line " + countLines);
                                    System.out.println("##queue size:" + dataQueueCounter.get());
                                }
                                countLines++;
                            }
                        }


                    }
                    int progressPercent = (int) ((float) i / listOfFiles.length * 100);
                    logger.log(Level.INFO, "Main:  " + progressPercent + "% read");
                    System.out.println("Main:  " + progressPercent + "% read");

                    //do not move files which are week between start and end.
                    long fileCreateTime = getFileUUID(currFile);
                    if (uuidRestrictionMin + OVERLAP_MILISECONDS < fileCreateTime && fileCreateTime < uuidRestrictionMax - OVERLAP_MILISECONDS) {
                        try {
                            Files.move(Paths.get(currFile.getPath()), Paths.get(JSONPATH + "/done/" + currFile.getName()));
                        } catch (IOException e) {
                            logger.log(Level.SEVERE, e.toString(), e);
                            System.out.println("IOException in Main:" + e.getMessage());
                            logger.warning("IOException in Main:");
                            logger.warning(e.getMessage());
                            e.printStackTrace();
                        }
                    }


                }


            }


            isReadAllFiles.set(true); //finished with all files.
            logger.info("Main: Read all files.");
            logger.info("Main: Waiting for processThreads to finish");
            processLatch.await(Long.MAX_VALUE, TimeUnit.SECONDS); //wait for pool to finish.
            logger.info("Main: Waiting for writeThreads to finish");

            for (ConcurrentHashMap tableHashMap : tableHashMaps) { //notify all write threads.
                synchronized (tableHashMap) {
                    tableHashMap.notifyAll();
                }
            }
            writeLatch.await(Long.MAX_VALUE, TimeUnit.SECONDS);//this will block main until the threads have finished writing is shutdown /time has passed. which comes first.
            logger.info("Main: writeThreads have finished. exiting..");

            System.out.println("Time ended:  " + DateFormat.getInstance().format(System.currentTimeMillis()));

            long totalTimeInSeconds = (System.currentTimeMillis() - startTime) / 1000;
            long minutes = totalTimeInSeconds / 60;
            long seconds = totalTimeInSeconds % 60;
            System.out.println("finish time:" + minutes + ":" + seconds);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkUsableSpace() throws IOException {
        File f = new File(OUTPUTPATH);
        FileStore fs = Files.getFileStore(f.toPath());

        //System.out.println("fs.getUsableSpace(): "+fs.getUsableSpace()/100000);

        while (fs.getUsableSpace() < LEAST_USABLE_SPACE) { // less than 10 gb.
            System.out.println("Time for no disk:  " + DateFormat.getInstance().format(System.currentTimeMillis()));
            JOptionPane.showMessageDialog(null, "Not enough disk space, less than 10 GB");
            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Clear some stuff and click ok to continue, or cancel to terminate. " +
                            "\nNote: Done files are listed inside 'done' folder.", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                System.out.println("YES_OPTION!");
            }
            if (dialogResult == JOptionPane.CANCEL_OPTION) {
                System.out.println("CANCEL_OPTION!");
                return true;
            }
        }
        return false;
    }

    //SET Thread for each Table to write output to tsv.
    private static void createWriteThreads(Thread[] writeThreads) {
        for (int i = 0; i < tableHashMaps.length; i++) {
            writeThreads[i] = new Thread(
                    new WriteDataRun(i,
                            tableNames[i],
                            tableHashMaps[i],
                            processLatch,
                            writeLatch));
            writeThreads[i].start();
        }

    }

    // assign a job for each thread.
    private static void createProcessThreads(Thread[] processThreads) {
        for (int i = 0; i < nProcessThreads; i++) {
            processThreads[i] = new Thread(new ProcessDataRun(i,
                    dataQueueCounter,
                    dataQueue,
                    dao,
                    tableHashMaps,
                    isMainThreadSleep,
                    isReadAllFiles,
                    processLatch));
            processThreads[i].start();
        }
    }

    private static void createOutputDoneFolders() throws IOException {

        File f = new File(OUTPUTPATH); //create outputTSV folder
        if (!f.isDirectory()) {
            logger.info("creating a directory..");
            if (!f.mkdir()) {
                throw new IOException("could not create directory");
            }
        }
        File fQfolder = new File(OUTPUTPATH + "/" + outputQFolder); //create outputTSV/outputQFolder folder
        if (!fQfolder.isDirectory()) {
            logger.info("creating a directory for outputQFolder");
            if (!fQfolder.mkdir()) {
                throw new IOException("could not create directory");
            }
        }

        File d = new File(JSONPATH + "/done"); //create inputDirectory/done folder.
        if (!d.isDirectory()) {
            logger.info("creating a directory for done files.");

            if (!d.mkdir()) {
                throw new IOException("could not create directory");
            }
        }
    }

    private static long getFileUUID(File currfile) {
        String fileName = currfile.getName();

        int underScore = fileName.indexOf('_') + 1;
        return Long.parseLong(fileName.substring(underScore, underScore + 13));

    }

    private static boolean isFileBetweenWeekRangeUUID(File file) {
        if (!file.isFile()) {
            return false;
        }
        String fileName = file.getName();
        if (fileName.indexOf('_') == -1) { //not in the format.
            return false;
        }
        long fileCreateTime = -1;
        try {

            fileCreateTime = getFileUUID(file);
        } catch (NumberFormatException e) {

            e.printStackTrace();
            //return false;
        }

        return (uuidRestrictionMin - OVERLAP_MILISECONDS) <= fileCreateTime && fileCreateTime < (uuidRestrictionMax + OVERLAP_MILISECONDS);
    }

    private static File[] init() throws IOException {
        System.out.println("initializing..");

        File folder = new File(JSONPATH);
        //get all files from folder
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles == null) {
            throw new NullPointerException();
        }
        int count = 0;
        for (File x : listOfFiles) {
            System.out.println(count++ + ":" + x.getName());
        }
        System.out.println("\nTOTAL " + count + " files");

        tableHashMaps = new ConcurrentHashMap[18]; //18 tables in hive.
        for (int i = 0; i < tableHashMaps.length; i++) {
            tableHashMaps[i] = new ConcurrentHashMap();
        }
        dao = new Dao(tableHashMaps);
        if (shouldLimitUUIDRange) {

            if (uuidRestrictionMax != 0 && uuidRestrictionMin != 0) {
                dao.uuidRestrictionMin = uuidRestrictionMin;
                dao.uuidRestrictionMax = uuidRestrictionMax;
            }
        }
        return listOfFiles;


    }

}



