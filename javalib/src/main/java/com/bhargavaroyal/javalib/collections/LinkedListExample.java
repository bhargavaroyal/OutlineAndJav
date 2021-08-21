package com.bhargavaroyal.javalib.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExample {
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        List list = new LinkedList();
        System.out.println("Enter the number of elements you want to enter in LL : ");
        int num_elements = s.nextInt();
        int x;
        for(int i =0;i<=num_elements;i++)
        {
            System.out.println("Enter element : ");
            x = s.nextInt();
//            list.insert(x);
        }
        System.out.println(">>>>> LINKED LIST AFTER INSERTION IS : ");
//        list.print();
//        int size = list.count();
//        System.out.println(">>>>> SIZE OF LL => "+size);
        System.out.println("Enter the node to be inserted in the middle: ");
        int mid_element = s.nextInt();
//        list.insertMiddle(mid_element);
        System.out.println(">>>> LL AFTER INSERTING THE NEW ELEMENT IN THE MIDDLE ");
//        list.print();
    }

}
