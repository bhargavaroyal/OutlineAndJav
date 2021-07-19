package com.bhargavaroyal.javalib.designpattern;

public class SingletonClassic {
    // This execution sequence creates two objects for singleton. Therefore this classic implementation is not thread safe.
    private static SingletonClassic obj;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private SingletonClassic() {
    }

    public static SingletonClassic getInstance() {
        if (obj == null)
            obj = new SingletonClassic();
        return obj;
    }
}