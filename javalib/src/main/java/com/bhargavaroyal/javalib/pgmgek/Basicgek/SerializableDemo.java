package com.bhargavaroyal.javalib.pgmgek.Basicgek;

import java.io.*;

class DeserializationDemo implements Serializable {
    private String name;

    DeserializationDemo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            DeserializationDemo d =
                    new DeserializationDemo("Serialization Demo");
            FileOutputStream f = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(d);
            oos.close();
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
