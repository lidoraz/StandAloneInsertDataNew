package com;

import com.BusinessLogic.Dao;
import javafx.util.Pair;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ProcessDataRun implements Runnable {

    private final  ConcurrentLinkedQueue<Pair<String, String>> dataQueue;
    private final int idx;
    private AtomicInteger dataQueueCounter;
    private final Dao dao;
    private final ConcurrentHashMap[] tableHashMaps;
    private final int QUEUE_LIMIT;
    private final AtomicBoolean isMainThreadSleep;
    private final AtomicBoolean isReadAllFiles;
    private final CountDownLatch processLatch;

    public ProcessDataRun(int idx, AtomicInteger dataQueueCounter,
                          ConcurrentLinkedQueue<Pair<String, String>> dataQueue, Dao dao,
                          ConcurrentHashMap[] tableHashMaps, AtomicBoolean isMainThreadSleep,
                          AtomicBoolean isReadAllFiles, CountDownLatch processLatch) {

        this.idx = idx;
        this.dataQueue = dataQueue;
        this.dataQueueCounter = dataQueueCounter;
        this.dao = dao;
        this.tableHashMaps = tableHashMaps;
        this.isMainThreadSleep = isMainThreadSleep;
        QUEUE_LIMIT = Main.QUEUE_LIMIT;
        this.isReadAllFiles = isReadAllFiles;
        this.processLatch = processLatch;
    }

    private void fetch() {
        Pair<String, String> jobPair = dataQueue.poll();

        if (jobPair != null) {
            dataQueueCounter.decrementAndGet();

            if (isMainThreadSleep.get()) {
                synchronized (dataQueue) { //limit dataQueue size, wake up main thread if it is sleeping.
                    if (dataQueueCounter.get() < QUEUE_LIMIT * 0.75) {
                        dataQueue.notifyAll();
                    }
                }
            }
            String userName = jobPair.getKey();
            String data = jobPair.getValue();
            dao.detectSensor(data, userName);

            notifyWriteThreads();

        }
    }

    private void notifyWriteThreads() {
        for (int i = 0; i < tableHashMaps.length; i++) { //notify all threads.
            synchronized (tableHashMaps[i]) {
                tableHashMaps[i].notifyAll();
            }
        }
    }

    @Override
    public void run() {
        int countFetch = 0;
        while (!isReadAllFiles.get() &&!Thread.interrupted()) {
            //read all files.
            while (!dataQueue.isEmpty()) {
                fetch();
                countFetch++;
                if (countFetch % 1000 == 0) {
                    System.out.println("procThread: '" + idx + "' has fetched '" + countFetch + "' files");
                }
            }
        }

        processLatch.countDown();
        notifyWriteThreads();
        System.out.println("exec thread '" + idx + "'+ has been finished countdown: "+ processLatch.getCount());
    }
}
