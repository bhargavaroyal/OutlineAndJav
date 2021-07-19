package com.bhargavaroyal.javalib.designpattern;

public class SingletonEagerInstantiation {
    //thread safe. Use this method only when your singleton class is light and is used throughout the execution of your program.
    private static SingletonEagerInstantiation obj = new SingletonEagerInstantiation();

    private SingletonEagerInstantiation() {}

    public static SingletonEagerInstantiation getInstance()
    {
        return obj;
    }
}