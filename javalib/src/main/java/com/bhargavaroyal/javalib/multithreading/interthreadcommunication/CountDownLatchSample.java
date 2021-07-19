package com.bhargavaroyal.javalib.multithreading.interthreadcommunication;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchSample {
    public static void main(String args[])
            throws InterruptedException
    {
        // Let us create task that is going to
        // wait for four threads before it starts
        CountDownLatch latch = new CountDownLatch(4);

        // Let us create four worker
        // threads and start them.
        WorkerThreadSample first = new WorkerThreadSample(1000, latch,
                "WORKER-1");
        WorkerThreadSample second = new WorkerThreadSample(2000, latch,
                "WORKER-2");
        WorkerThreadSample third = new WorkerThreadSample(3000, latch,
                "WORKER-3");
        WorkerThreadSample fourth = new WorkerThreadSample(4000, latch,
                "WORKER-4");
        first.start();
        second.start();
        third.start();
        fourth.start();

        // The main task waits for four threads
        latch.await();

        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                " has finished");
    }
}


