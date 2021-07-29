package com.bhargavaroyal.javalib;

import com.bhargavaroyal.javalib.multithreading.EvenOddPrint;
import com.bhargavaroyal.javalib.multithreading.ThreadCreation;

public class MyMainClass {
    static int setallbitgivenrange(int n,
                                   int l, int r)
    {

        // calculating a number 'range'
        // having set bits in the range
        // from l to r and all other
        // bits as 0 (or unset).
        int range = (((1 << (l - 1)) - 1) ^
                ((1 << (r)) - 1));
System.out.println("range: "+range +"n:");
        return (n | range);
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 17, l = 2, r = 3;

        System.out.println(setallbitgivenrange(
                n, l, r));
    }
}