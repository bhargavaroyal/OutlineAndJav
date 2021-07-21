package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Input:
#Add nodes to the list
sList.addNode(5);
sList.addNode(8);
sList.addNode(1);
sList.addNode(6);
Output:
Minimum value node in the list: 1
Maximum value node in the list: 8
*/
/*Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class MinMax which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	minNode() will display minimum value node:
1.	Define a variable min and initialize it with head's data.
2.	Node current will point to head.
3.	Iterate through the list by comparing each node's data with min.
4.	If min is greater than current's data then, min will hold current's data.
5.	At the end of the list, variable min will hold minimum value node.
6.	Display the min value.
5.	maxNode() will display maximum value node:
1.	Define a variable max and initialize it with head's data.
2.	Node current will point to head.
3.	Iterate through the list by comparing each node's data with max.
4.	If max is less than current's data then, max will hold current's data.
5.	At the end of the list, variable max will hold maximum value node.
6.	Display the max value.
*/
public class MaxMinNodeLinkedList {

    /*public class MinMax {

    //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //minNode() will find out the minimum value node in the list
    public void minNode() {
        Node current = head;
        int min;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            //Initializing min with head node data
            min = head.data;

            while(current != null){
                 //If current node's data is smaller than min
                 //Then, replace value of min with current node's data
                 if(min > current.data) {
                     min = current.data;
                 }
                 current= current.next;
            }
            System.out.println("Minimum value node in the list: "+ min);
        }
    }

    //maxNode() will find out the maximum value node in the list
    public void maxNode() {
        Node current = head;
        int max;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            //Initializing max with head node data
            max = head.data;

            while(current != null){
                 //If current node's data is greater than max
                 //Then, replace value of max with current node's data
                 if(max < current.data) {
                     max = current.data;
                 }
                 current = current.next;
            }
            System.out.println("Maximum value node in the list: "+ max);
        }
    }

    public static void main(String[] args) {

        MinMax sList = new MinMax();

        //Adds data to the list
        sList.addNode(5);
        sList.addNode(8);
        sList.addNode(1);
        sList.addNode(6);

        //Display the minimum value node in the list
        sList.minNode();

        //Display the maximum value node in the list
        sList.maxNode();
    }
}
*/
}
