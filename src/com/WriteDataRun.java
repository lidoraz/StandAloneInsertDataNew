package com;

import com.BusinessLogic.Dao;
import com.xyz.Dto;
import javafx.util.Pair;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class WriteDataRun implements Runnable {

    private final int idx;
    private final CountDownLatch processLatch;
    private final CountDownLatch writeLatch;
    private int maxItemsForRun = 0;
    private long countWrite = 0;
    private FileWriter fileWriter;
    private String tableName;
    private final ConcurrentHashMap hashMap;
    private final int EXIST_IN_MAP_DURATION;

    public WriteDataRun(int idx, String tableName,
                        ConcurrentHashMap hashMap, CountDownLatch processLatch, CountDownLatch writeLatch) {
        this.idx = idx;
        this.hashMap = hashMap;
        this.tableName = tableName;

        this.processLatch = processLatch;
        this.EXIST_IN_MAP_DURATION = Main.EXIST_IN_MAP_DURATION;
        this.writeLatch = writeLatch;
    }

    //boolean is for T0toT3 tables, which during the process stay some time before written in order to fill their row.
    private void writeToFile(boolean isLongerTimeForEntry) throws IOException {
        maxItemsForRun = Math.max(maxItemsForRun, hashMap.size());

        long curTime = System.currentTimeMillis();
        for (Object key : hashMap.keySet()) {
            //deal with T2,T1,T3,T0 - all have several probes.
            if (idx >= Dao._T0 && idx <= Dao._T3) {
                if (isLongerTimeForEntry) {
                    Dto data = (Dto) hashMap.get(key);
                    if (curTime - data.getCreatedOnTimestamp() < EXIST_IN_MAP_DURATION) { //wait for entire dto to fill up.
                        continue;
                    }
                }
            }
            fileWriter.write(hashMap.remove(key).toString() + "\n");
            countWrite++;

            if (countWrite % (100000) == 0) {
                System.out.println("writeThread " + idx + ": " + tableName + ", has written " + NumberFormat.getIntegerInstance().format(countWrite) + " sessions");
            }

        }

    }

    @Override
    public void run() {


        try {
//            File f = new File("outputTSV\\" + tableName + ".tsv");
//            if (!f.exists()) {
//                if (!f.createNewFile()) {
//                    throw new IOException("could not create directory");
//                }
//            }

            File f = new File("outputTSV\\"+Main.outputQFolder+"\\" + tableName + ".tsv");
            if (!f.exists()) {
                if (!f.createNewFile()) {
                    throw new IOException("could not create directory");
                }
            }

            fileWriter = new FileWriter(f);

            //while process Threads still run, try to write into memory.
            while (processLatch.getCount() > 0 &&!Thread.interrupted()) {

                synchronized (hashMap) {
                    while (hashMap.isEmpty() && processLatch.getCount() > 0) {
                        hashMap.wait();
                    }
                }

                writeToFile(true);
                //fileWriter.flush();

            }
            writeToFile(false);

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();

        } catch (InterruptedException e) {
            System.out.println("Write Thread "+idx +" was Interrupted");
           // e.printStackTrace();
        } finally {

            writeLatch.countDown();
            System.out.println("DONE: writeThread " + idx + ": '" + tableName + "' total " + NumberFormat.getIntegerInstance().format(countWrite) + " rows. maximum load for map: " + maxItemsForRun + "items | countdown:"+ writeLatch.getCount());
        }

    }
}
