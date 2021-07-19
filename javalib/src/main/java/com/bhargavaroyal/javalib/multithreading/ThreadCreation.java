package com.bhargavaroyal.javalib.multithreading;

import java.util.Random;

public class ThreadCreation extends Thread {
    private int randomNumer;

    @Override
    public void run() {
        try {
            System.out.println("ThreadExtend ID: "+Thread.currentThread().getId());
        }catch (Exception e){

        }
    randomNumer = new Random().nextInt(100);
    System.out.println("Thread extends Random number: "+randomNumer);

    }

    public static class ThreadRunnable implements Runnable{
        private int random;
        @Override
        public void run() {
            try {
                System.out.println("ThreadRunnable ID: "+Thread.currentThread().getId());
            }catch (Exception e){

            }
            random = new Random().nextInt(100);
            System.out.println("Thread Runnable Random number: "+random);
        }
    }
}
/* public static void main(String[] args) {
        System.out.println("MyMainClass executed");
        ThreadCreation t1 = new ThreadCreation();
        Thread t2 = new Thread(new ThreadCreation.ThreadRunnable());
        t1.start();
        t2.start();

    }*/
