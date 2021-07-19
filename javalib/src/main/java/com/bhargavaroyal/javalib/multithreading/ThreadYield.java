package com.bhargavaroyal.javalib.multithreading;
/*yield:() indicates that the thread is not doing anything particularly important and if any other threads or
 processes need to be run, they can. Otherwise, the current thread will continue to run.
sleep(): causes the thread to definitely stop executing for a given amount of time; if no other thread or
process needs to be run, the CPU will be idle (and probably enter a power saving mode).
*/
public class ThreadYield {
    static class MyThread extends Thread
    {
        public void run()
        {
            for (int i=0; i<5 ; i++)
                System.out.println(Thread.currentThread().getName()
                        + " in control");
        }
    }

    // Driver Class
    public static class yieldDemo
    {
        public static void main(String[]args)
        {
            MyThread t = new MyThread();
            t.start();
            System.out.println(Thread.currentThread().getName()
                    + " first in control");
            for (int i=0; i<5; i++)
            {
                // Control passes to child thread
                Thread.yield();

                // After execution of child Thread
                // main thread takes over
                System.out.println(Thread.currentThread().getName()
                        + " in control");
            }
        }
    }

}
