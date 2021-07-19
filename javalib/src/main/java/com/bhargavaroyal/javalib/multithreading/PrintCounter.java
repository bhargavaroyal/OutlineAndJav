package com.bhargavaroyal.javalib.multithreading;

public class PrintCounter {
    public static void printCountValue() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("counter Value: "+i);
            }
        } catch (Exception e) {
            System.out.println("Interrupted Thread");
        }
    }
}
