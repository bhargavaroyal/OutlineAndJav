package com.bhargavaroyal.javalib.programs.doubleLinkedList;
/*Input:
#Add nodes to the list
dList.addNode(5);
dList.addNode(7);
dList.addNode(9);
dList.addNode(1);
dList.addNode(2);
Output:
Minimum value node in the list: 1
Maximum value node in the list: 9

In this program, we will create a doubly linked list then, iterate through the list to find out the minimum and maximum node.

We will maintain two variables min and max. Min will hold the minimum value node, and max will hold the maximum value node. In above example, 1 will be the minimum value node and 9 will be the maximum value node.
Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating the doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	minimumNode() will prints out minimum value node:
1.	Define variable min and initialize with head's data.
2.	Current will point to head.
3.	Iterate through the list by comparing each node's data with min.
4.	If min > current's data then min will hold current's data.
5.	At the end of the list, variable min will hold the minimum value node.
6.	Print the min value.
4.	maximumNode() will prints out maximum value node:
1.	Define variable max and initialize with head's data.
2.	Current will point to head.
3.	Iterate through the list by comparing each node's data with max.
4.	If max < current's data then max will hold current?s data.
5.	At the end of the list, variable max will hold the maximum value node.
6.	Print the max value.
*/
public class MaxMinNodeDLL {
/*    //Represent a node of the doubly linked list

    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //Represent the head and tail of the doubly linked list
    Node head, tail = null;

    //addNode() will add a node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //If list is empty
        if(head == null) {
            //Both head and tail will point to newNode
            head = tail = newNode;
            //head's previous will point to null
            head.previous = null;
            //tail's next will point to null, as it is the last node of the list
            tail.next = null;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode's previous will point to tail
            newNode.previous = tail;
            //newNode will become new tail
            tail = newNode;
            //As it is last node, tail's next will point to null
            tail.next = null;
        }
    }

    //MinimumNode() will find out minimum value node in the list
    public int minimumNode() {
        //Node current will point to head
        Node current = head;
        int min;

        //Checks if list is empty
        if(head == null) {
            System.out.println("List is empty");
            return 0;
        }
        else {
            //Initially, min will store the value of head's data
            min = head.data;
            while(current != null) {
                //If the value of min is greater than the current's data

                //Then, replace the value of min with current node's data

                if(min > current.data)
                    min = current.data;
                current = current.next;
            }
        }
        return min;
    }

    //MaximumNode() will find out maximum value node in the list
    public int maximumNode() {
        //Node current will point to head
        Node current = head;
        int max;

        //Checks if list is empty
        if(head == null) {
            System.out.println("List is empty");
            return 0;
        }
        else {
            //Initially, max will store the value of head's data
            max = head.data;
            //If value of max is lesser than current's data
            //Then, replace value of max with current node's data
            while(current != null) {
                if(current.data > max)
                    max = current.data;
                current = current.next;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        MinMax dList = new MinMax();
        //Add nodes to the list
        dList.addNode(5);
        dList.addNode(7);
        dList.addNode(9);
        dList.addNode(1);
        dList.addNode(2);

        //Prints the minimum value node in the list
        System.out.println("Minimum value node in the list: "+ dList.minimumNode());
        //Prints the maximum value node in the list
        System.out.println("Maximum value node in the list: "+ dList.maximumNode());
    }
*/
}
