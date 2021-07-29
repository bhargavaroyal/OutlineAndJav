package com.bhargavaroyal.javalib.basics;

public class removeRightMostbit2 {
    public static void main(String[] args) {
        int N = 12;

        func(N);
    }

    static void func(int n) {
        for(int bit = 0; bit < 32; bit++)
        {

            // Checking whether bit position
            // is set or not
            if ((n >> bit) % 2 > 0)
            {

                // If bit position is found set,
                // we flip this bit by xoring
                // given number and number with
                // bit position set
                n = n ^ (1 << bit);
                break;
            }
        }
        System.out.print("The number after unsetting the");
        System.out.print(" rightmost set bit " + n);
    }

}
