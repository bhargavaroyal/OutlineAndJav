package com.bhargavaroyal.javalib.multithreading.interthreadcommunication;

import java.util.Scanner;

/*
yield:() indicates that the thread is not doing anything particularly important and if any other threads or
 processes need to be run, they can. Otherwise, the current thread will continue to run.
sleep(): causes the thread to definitely stop executing for a given amount of time; if no other thread or
process needs to be run, the CPU will be idle (and probably enter a power saving mode).

1.	join(): It will put the current thread on wait until the thread on which it is called is dead.
If thread is interrupted then it will throw InterruptedException.

•	wait()-It tells the calling thread to give up the lock and go to sleep until some
            other thread enters the same monitor and calls notify().
•	notify()-It wakes up one single thread that called wait() on the same object.
            It should be noted that calling notify() does not actually give up a lock on a resource.
•	notifyAll()-It wakes up all the threads that called wait() on the same object.

public static int MIN_PRIORITY: This is minimum priority that a thread can have. Value for this is 1.
public static int NORM_PRIORITY: This is default priority of a thread if do not explicitly define it. Value for this is 5.
public static int MAX_PRIORITY: This is maximum priority of a thread. Value for this is 10.

The purpose of start() is to create a separate call stack for the thread.
 A separate call stack is created by it, and then run() is called by JVM.

Get and Set Thread Priority:
1.	public final int getPriority(): java.lang.Thread.getPriority() method returns priority of given thread.
2.	public final void setPriority(int newPriority): java.lang.Thread.setPriority() method changes
the priority of thread to the value newPriority. This method throws IllegalArgumentException
if value of parameter newPriority goes beyond minimum(1) and maximum(10) limit.

•	If two threads have same priority then we can’t expect which thread will execute first.
It depends on thread scheduler’s algorithm(Round-Robin, First Come First Serve, etc)


Java provides a way of creating threads and synchronizing their task by using synchronized blocks.
Synchronized blocks in Java are marked with the synchronized keyword. A synchronized block in Java is synchronized on some object.
 Multi-threaded programs may often come to a situation where multiple threads try to access the same resources and
 finally produce erroneous and unforeseen results.
 All synchronized blocks synchronized on the same object can only have one thread executing inside them at a time.


*/

public class InterThreadSample {
    public static void main(String[] args)
            throws InterruptedException
    {
        final PC pc = new PC();

        // Create a thread object that calls pc.produce()
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        // Create another thread object that calls
        // pc.consume()
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.consume();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }

    // PC (Produce Consumer) class with produce() and
    // consume() methods.
    public static class PC
    {
        // Prints a string and waits for consume()
        public void produce()throws InterruptedException
        {
            // synchronized block ensures only one thread
            // running at a time.
            synchronized(this)
            {
                System.out.println("producer thread running");

                // releases the lock on shared resource
                wait();

                // and waits till some other method invokes notify().
                System.out.println("Resumed");
            }
        }

        // Sleeps for some time and waits for a key press. After key
        // is pressed, it notifies produce().
        public void consume()throws InterruptedException
        {
            // this makes the produce thread to run first.
            Thread.sleep(1000);
            Scanner s = new Scanner(System.in);

            // synchronized block ensures only one thread
            // running at a time.
            synchronized(this)
            {
                System.out.println("Waiting for return key.");
                s.nextLine();
                System.out.println("Return key pressed");

                // notifies the produce thread that it
                // can wake up.
                notify();

                // Sleep
                Thread.sleep(2000);
            }
        }
    }

}
