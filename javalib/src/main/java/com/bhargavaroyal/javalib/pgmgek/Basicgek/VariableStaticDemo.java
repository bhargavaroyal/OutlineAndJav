package com.bhargavaroyal.javalib.pgmgek.Basicgek;

public class VariableStaticDemo
{
    public static void main(String args[]) {

        //accessing static variable without object
        VariableStatic.salary = 1000;
        System.out.println(VariableStatic.name + "'s average salary:" + VariableStatic.salary);
    }

}
