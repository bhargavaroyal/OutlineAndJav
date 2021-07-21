package com.bhargavaroyal.javalib.programs.doubleLinkedList;
/*Input:
#Adding 1 to the list
dList.addAtStart(1);
#Adding 2 to the list
dList.addAtStart(2);
#Adding 3 to the list
dList.addAtStart(3);
#Adding 4 to the list
dList.addAtStart(4);
#Adding 5 to the list
dList.addAtStart(5);
Output:
Adding a node to the start of the list: 1
Adding a node to the start of the list: 2 1
Adding a node to the start of the list: 3 2 1
Adding a node to the start of the list: 4 3 2 1
Adding a node to the start of the list: 5 4 3 2 1
In this program, we will create a doubly linked list and insert every new node at the beginning of the list. If the list is empty, then head and tail will point to the newly added node. If the list is not empty then, insert the new node at the beginning of the list such that the head's previous will point to new node. Make new node as head of the list, and its previous will point to null.

Consider the above example. Initially, 1 was the head of the list. Now new will be inserted before node 1 such that node 1's previous will point to new. Make new as the head of the list, and its previous will point to null.
Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating a doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	addAtStart() will add a node to the beginning of the list:
1.	It first checks whether the head is null, then it will insert the node as the head.
2.	Both head and tail will point to a newly added node.
3.	Head's previous pointer will point to null and tail's next pointer will point to null.
4.	If the head is not null, head's previous will point to new node.
5.	Make new node as head of the list.
6.	Since new node became head so its previous should point to null.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current points to null.
3.	Current will point to the next node in the list in each iteration.
*/
public class InsertNodeBeginningDLL {
/*//Represent a node of the doubly linked list

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

    //addAtStart() will add a node to the starting of the list
    public void addAtStart(int data) {
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
        //Add newNode as new head of the list
        else {
            //head's previous node will be newNode
            head.previous = newNode;
            //newNode's next node will be head
            newNode.next = head;
            //newNode's previous will point to null
            newNode.previous = null;
            //newNode will become new head
            head = newNode;
        }
    }

    //display() will print out the nodes of the list
    public void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding a node to the start of the list: ");
        while(current != null) {
            //Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertStart dList = new InsertStart();

        //Adding 1 to the list
        dList.addAtStart(1);
        dList.display();
        //Adding 2 to the list
        dList.addAtStart(2);
        dList.display();
        //Adding 3 to the list
        dList.addAtStart(3);
        dList.display();
        //Adding 4 to the list
        dList.addAtStart(4);
        dList.display();
        //Adding 5 to the list
        dList.addAtStart(5);
        dList.display();
    }
*/
}
