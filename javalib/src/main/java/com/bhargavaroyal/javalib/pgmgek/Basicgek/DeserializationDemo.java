package com.bhargavaroyal.javalib.pgmgek.Basicgek;

// Java program to illustrate creation of Object
// using Deserialization.

import java.io.*;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            DeserializationDemo d;
            FileInputStream f = new FileInputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            d = (DeserializationDemo) oos.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(d.name);
    }
}