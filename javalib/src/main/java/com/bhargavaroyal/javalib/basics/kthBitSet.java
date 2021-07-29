package com.bhargavaroyal.javalib.basics;

public class kthBitSet {
    public static void main(String[] args) {
        int n = 5, k = 1;
        func(n, k);
    }
    static void func(int n, int k){
        if (((n >> (k - 1)) &
                1) > 0)
            System.out.println("SET");
        else
            System.out.println("NOT SET");
    }

}
