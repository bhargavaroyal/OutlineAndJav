package com.bhargavaroyal.javalib.programs.doubleLinkedList;
/*Input:
#Adding 1 to the list
dList.addAtEnd(1);
#Adding 2 to the list
dList.addAtEnd(2);
#Adding 3 to the list
dList.addAtEnd(3);
#Adding 4 to the list
dList.addAtEnd(4);
#Adding 5 to the list
dList.addAtEnd(5);
Output:
Adding a node to the end of the list: 1
Adding a node to the end of the list: 1 2
Adding a node to the end of the list: 1 2 3
Adding a node to the end of the list: 1 2 3 4
Adding a node to the end of the list: 1 2 3 4 5
In this program, we will create a doubly linked list and insert every new node at the end of the list. If the list is empty, then head and tail will point to newly added node. If list is not empty then, insert the new node at the end of the list such that tail's next will point to new node. Make new node as new tail of the list and its next will point to null.

In above example, node 4 was the tail of the list. Now, the new node will be inserted at the end of the list such that node 4's next will point to new node. Make new node as the tail of the list, and its next will point to null.
Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating a doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	addAtEnd() will add node to the list:
1.	It first checks whether the head is null, then it will insert the node as the head.
2.	Both head and tail will point to a newly added node.
3.	Head's previous pointer will point to null and tail's next pointer will point to null.
4.	If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
5.	The new node will become the new tail. Tail's next pointer will point to null.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current points to null.
3.	Current will point to the next node in the list in each iteration.
*/
public class InsertNodeEndDLL {
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

    //addAtEnd() will add a node to the end of the list
    public void addAtEnd(int data) {
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
        //Add newNode as new tail of the list
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

    //display() will print out the nodes of the list
    public void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding a node to the end of the list: ");
        while(current != null) {
            //Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertEnd dList = new InsertEnd();

        //Adding 1 to the list
        dList.addAtEnd(1);
        dList.display();
        //Adding 2 to the list
        dList.addAtEnd(2);
        dList.display();
        //Adding 3 to the list
        dList.addAtEnd(3);
        dList.display();
        //Adding 4 to the list
        dList.addAtEnd(4);
        dList.display();
        //Adding 5 to the list
        dList.addAtEnd(5);
        dList.display();
    }
*/
}
