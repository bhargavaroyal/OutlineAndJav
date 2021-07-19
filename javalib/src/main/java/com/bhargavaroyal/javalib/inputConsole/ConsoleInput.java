package com.bhargavaroyal.javalib.inputConsole;

public class ConsoleInput {
    public static void main(String[] args)
    {
        // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println(name);
    }

}
