package com.bhargavaroyal.javalib.multithreading.interthreadcommunication;

import java.util.concurrent.Semaphore;

public class SemaphoreSample extends Thread
{
    Semaphore sem;
    String threadName;
    public SemaphoreSample(Semaphore sem, String threadName)
    {
        super(threadName);
        this.sem = sem;
        this.threadName = threadName;
    }

    @Override
    public void run() {

        // First, get a permit.
        System.out.println(threadName + " is waiting for a permit.");

        try {
            // acquire method
            sem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + " gets a permit");

        // Now, critical section
        // other waiting threads will wait, until this
        // thread release the lock
        for(int i=0; i < 2; i++)
        {
            // hasQueuedThreads() methods
            boolean b = sem.hasQueuedThreads();
            if(b)
                // getQueuedLength() methods
                System.out.println("Length of Queue : " + sem.getQueueLength())    ;

            // Now, allowing a context switch -- if possible.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        // Release the permit.
        System.out.println(threadName + " releases the permit.");

        // release() method
        sem.release();
    }
}
/*
// Driver class
public class SemaphoreDemo
{

    public static void main(String args[]) throws InterruptedException
    {
        // creating a Semaphore object
        // with number of permits 3 and fairness true
        Semaphore sem = new Semaphore(3, true);

        //isFair() method
        System.out.println("is Fairness enabled : " + sem.isFair());

        // Main thread try to acquire 2 permits
        // tryAcquire(int permits) method
        sem.tryAcquire(2);

        // availablePermits() method
        System.out.println("Available permits : " + sem.availablePermits());

        //drainPermits() method
        System.out.println("number of permits drain by Main thread : "
                + sem.drainPermits());

        // permit released by Main thread
        sem.release(1);

        // creating two threads with name A and B
        SemaphoreSample mt1 = new SemaphoreSample(sem, "A");
        SemaphoreSample mt2 = new SemaphoreSample(sem, "B");


        // starting threads A
        mt1.start();

        // starting threads B
        mt2.start();

        // toString method
        System.out.println(sem.toString());


        // waiting for threads A and B
        mt1.join();
        mt2.join();
    }
}*/

