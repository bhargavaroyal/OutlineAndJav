package com.bhargavaroyal.javalib.designpattern;

public class SingletonClassicSynchronised {
    //  thread safe.
    private static SingletonClassicSynchronised obj;

    private SingletonClassicSynchronised() {
    }

    // Only one thread can execute this at a time
    public static synchronized SingletonClassicSynchronised getInstance() {
        if (obj == null)
            obj = new SingletonClassicSynchronised();
        return obj;
    }
}