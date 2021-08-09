package com.bhargavaroyal.javalib.designpattern;

// Java program to demonstrate implementation of Singleton
// pattern using private constructors.

class MySingleton {
    static MySingleton instance = null;
    public int x = 10;

    // private constructor can't be accessed outside the class
    private MySingleton() {
    }

    // Factory method to provide the users with instances
    static public MySingleton getInstance() {
        if (instance == null)
            instance = new MySingleton();

        return instance;
    }
}

// Driver Class
/*class Main
{
    public static void main(String args[])
    {
        com.bhargavaroyal.javacodelib.DesignPattern.MySingleton a = com.bhargavaroyal.javacodelib.DesignPattern.MySingleton.getInstance();
        com.bhargavaroyal.javacodelib.DesignPattern.MySingleton b = com.bhargavaroyal.javacodelib.DesignPattern.MySingleton.getInstance();
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
    }*/
//}

