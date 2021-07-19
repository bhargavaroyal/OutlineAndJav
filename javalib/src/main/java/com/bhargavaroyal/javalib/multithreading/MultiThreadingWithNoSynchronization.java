package com.bhargavaroyal.javalib.multithreading;

/*
 * When we start two or more threads within a program, there may be a situation when multiple threads try to access
 *  the same resource and finally they can produce unforeseen result due to concurrency issues.
 * So there is a need to synchronize the action of multiple threads and make sure that only one thread can access the resource
 *  at a given point in time. This is implemented using a concept called monitors. Each object in Java is associated with a monitor,
 *  which a thread can lock or unlock. Only one thread at a time may hold a lock on a monitor.*/
public class MultiThreadingWithNoSynchronization extends Thread {
    private Thread thread;
    private String threadname;
    private PrintCounter printCounter;

    public MultiThreadingWithNoSynchronization(String name, PrintCounter pc) {
        threadname = name;
        printCounter = pc;
    }

    @Override
    public void run() {
        System.out.println("exiting: " + threadname);
        printCounter.printCountValue();
    }

    @Override
    public void start() {
        System.out.println("starting: " + threadname);
        if (thread == null) {
            thread = new Thread(this, threadname);
            thread.start();
        }
    }


}
