package com.bhargavaroyal.javalib.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionSample {

    public static void main(String args[])
    {
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }

        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }


        try {

            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }

        try {
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }

        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }


    }


}

/*
* 1.	Arithmetic Exception
It is thrown when an exceptional condition has occurred in an arithmetic operation.
2.	ArrayIndexOutOfBoundException
It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.
3.	ClassNotFoundException
This Exception is raised when we try to access a class whose definition is not found
4.	FileNotFoundException
This Exception is raised when a file is not accessible or does not open.
5.	IOException
It is thrown when an input-output operation failed or interrupted
6.	InterruptedException
It is thrown when a thread is waiting , sleeping , or doing some processing , and it is interrupted.
7.	NoSuchFieldException
It is thrown when a class does not contain the field (or variable) specified
8.	NoSuchMethodException
It is thrown when accessing a method which is not found.
9.	NullPointerException
This exception is raised when referring to the members of a null object. Null represents nothing
10.	NumberFormatException
This exception is raised when a method could not convert a string into a numeric format.
11.	RuntimeException
This represents any exception which occurs during runtime.
12.	StringIndexOutOfBoundsException
It is thrown by String class methods to indicate that an index is either negative than the size of the string

* */
