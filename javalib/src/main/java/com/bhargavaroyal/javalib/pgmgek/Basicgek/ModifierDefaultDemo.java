package com.bhargavaroyal.javalib.pgmgek.Basicgek;

//Java program to illustrate error while
//using class from different package with
//default modifier


//This class is having default access modifier
class ModifierDefaultDemo
{
    public static void main(String args[])
    {
        //accessing class Geek from package p1
        ModifierDefault obj = new ModifierDefault();

        obj.display();
    }
}