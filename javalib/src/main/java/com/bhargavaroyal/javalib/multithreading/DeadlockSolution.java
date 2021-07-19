package com.bhargavaroyal.javalib.multithreading;

public class DeadlockSolution {
    public static Object lock3 = new Object();
    public static Object lock4 = new Object();

    public static class DeadlockThread1 extends Thread{
        @Override
        public void run() {
            synchronized (lock3){
                System.out.println("the thread 1 lock 3");
            }try{Thread.sleep(10);}
            catch (InterruptedException e){
            }
            System.out.println("the thread 1 before lock4");
            synchronized (lock4){
                System.out.println("the thread 1 lock4");
            }
        }
    }

    public static class DeadlockThread2 extends Thread{
        @Override
        public void run() {
            synchronized (lock4){
                System.out.println("the thread 2 lock 3");
            }try{Thread.sleep(10);}
            catch (InterruptedException e){
            }
            System.out.println("the thread 2 lock3 before");
            synchronized (lock3){
                System.out.println("the thread 1 lock4");
            }
        }
    }


}
