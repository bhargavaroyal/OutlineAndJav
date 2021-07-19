package com.bhargavaroyal.javalib.multithreading;

public class MultiThreadingWithSynchronization extends Thread{

    private Thread t;
    private String threadName;
    PrintCounter PD;

    public MultiThreadingWithSynchronization(String name, PrintCounter pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
        synchronized(PD) {
            PD.printCountValue();
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

}
