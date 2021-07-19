package com.bhargavaroyal.javalib.designpattern;

public class SingletonDoubleCheckLock {
    private static volatile SingletonDoubleCheckLock obj  = null;

    private SingletonDoubleCheckLock() {}

    public static SingletonDoubleCheckLock getInstance()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (SingletonDoubleCheckLock.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new SingletonDoubleCheckLock();
            }
        }
        return obj;
    }

}