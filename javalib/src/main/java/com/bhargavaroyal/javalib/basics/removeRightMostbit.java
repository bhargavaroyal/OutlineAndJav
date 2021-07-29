package com.bhargavaroyal.javalib.basics;

public class removeRightMostbit {
    public static void main(String[] args) {
        int a = 7;
        func(a);
    }

    static int func(int n) {
        int c = n & (n - 1);
        System.out.println("The value of rightmost bit temoved of: " + n + "is : " + c);
        return c;
    }

}
