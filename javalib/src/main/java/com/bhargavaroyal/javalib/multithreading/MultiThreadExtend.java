package com.bhargavaroyal.javalib.multithreading;

public class MultiThreadExtend extends Thread {

    private static final String TAG = "MultiThreadExtend";

    @Override
    public void run() {
        try {
            System.out.println("t1 multi extend Thread" + Thread.currentThread().getId() + " is runnning");
        } catch (Exception e) {
            System.out.println("Exception is :caught");
        }
    }
    /*// Main Class
    public class Multithread
    {
        public static void main(String[] args)
        {
            int n = 8; // Number of threads
            for (int i=0; i<8; i++)
            {
                MultithreadingDemo object = new MultithreadingDemo();
                object.start();
            }
        }
    }*/


}
