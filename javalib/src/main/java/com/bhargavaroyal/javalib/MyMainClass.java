package com.bhargavaroyal.javalib;

import com.bhargavaroyal.javalib.multithreading.EvenOddPrint;
import com.bhargavaroyal.javalib.multithreading.ThreadCreation;

public class MyMainClass {
    public static void main(String[] args) {
        // Create an object of class
        final EvenOddPrint evenOddPrint = new EvenOddPrint();
        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                evenOddPrint.printEvenNumber();
            }
        });

        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                evenOddPrint.printOddNumber();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

    }
}