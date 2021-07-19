package com.bhargavaroyal.javalib.multithreading;

public class MultiThreadRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("t2 Thread runnable : " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Multi Thread runnable exception");
        }
    }

    /*
    class Multithread
    {
        public static void main(String[] args)
        {
            int n = 8; // Number of threads
            for (int i=0; i<8; i++)
            {
                Thread object = new Thread(new MultiThreadRunnable());
                object.start();
            }
        }
    }
*/
}
