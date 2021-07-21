package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Singly Linked List
The singly linked list is a linear data structure in which each element of the list contains a pointer which points to the next element in the list. Each element in the singly linked list is called a node. Each node has two components: data and a pointer next which points to the next node in the list. The first node of the list is called as head, and the last node of the list is called a tail. The last node of the list contains a pointer to the null. Each node in the list can be accessed linearly by traversing through the list from head to tail.

Consider the above example; node 1 is the head of the list and node 4 is the tail of the list. Each node is connected in such a way that node 1 is pointing to node 2 which in turn pointing to node 3. Node 3 is again pointing to node 4. Node 4 is pointing to null as it is the last node of the list.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node.
2.	Create another class which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to the newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to the newly added node. This new node will become the new tail of the list.
4.	display() will display the nodes present in the list:
1.	Define a node current which initially points to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class CreateDisplayLinkedList {
/*
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

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SinglyLinkedList sList = new SinglyLinkedList();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Displays the nodes present in the list
        sList.display();
    }

* */

}
