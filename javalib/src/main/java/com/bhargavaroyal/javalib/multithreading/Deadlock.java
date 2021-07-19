package com.bhargavaroyal.javalib.multithreading;
/*Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
Deadlock occurs when multiple threads need the same locks but obtain them in different order.
A Java multithreaded program may suffer from the deadlock condition because the synchronized keyword
 causes the executing thread to block while waiting for the lock, or monitor, associated with the specified object.
 Here is an example.*/

public class Deadlock {
    public static Object lock1;
    public static Object lock2;

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("thread 1: lock1 holding");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                synchronized (lock2) {
                    System.out.println("thread 1: lock2 holding");
                }
            }

        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("thread 2 lock2 ongoing");
                try {Thread.sleep(10);}
                catch (InterruptedException e){}
                synchronized (lock1){
                    System.out.println("Thread 2 lock1 waiting");
                }
            }
        }
    }
}
