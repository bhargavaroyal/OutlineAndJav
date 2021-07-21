package com.bhargavaroyal.javalib.programs.doubleLinkedList;
/*Input:
#Add nodes to the list
dList.addNode(1);
dList.addNode(2);
dList.addNode(3);
dList.addNode(4);
dList.addNode(5);
Output:
Original List: 1 2 3 4 5
Updated List: 1 2 3 4
Updated List: 1 2 3
Updated List: 1 2
Updated List: 1
Updated List: List is empty
In this program, we will create a doubly linked list and delete a node from the end of the list. If the list is empty, print the message "List is empty". If the list is not empty, tail's previous node will become the new tail of the list thus, deleting the last node from the list.

In above example, node new was the tail of the list. Make tail's previous node that is, node 4 as the tail of the list. Node 4's next will point to null.
Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating the doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	deleteFromEnd() will delete a node from the end of the list:
1.	It first checks whether the head is null (empty list) then, it will return from the function as there is no node present in the list.
2.	If the list is not empty, it will check whether the list has only one node.
3.	If the list has only one node, it will set both head and tail to null.
4.	If the list has more than one node then, tail's previous node will become the new tail of the list.
5.	This new tail will point to null thus, delete the last node of the list.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current points to null.
3.	Current will point to the next node in the list in each iteration.
*/
public class DeleteNodeFromEndDLL {
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

    //deleteFromEnd() will delete a node from the end of the list
    public void deleteFromEnd() {
        //Checks whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Checks whether the list contains only one node
            if(head != tail) {
                //Previous node to the tail will become new tail
                tail = tail.previous;
                //Node next to current tail will be made null
                tail.next = null;
            }
            //If the list contains only one element
            //Then it will remove node and now both head and tail will point to null
            else {
                head = tail = null;
            }
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
        while(current != null) {
            //Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DeleteEnd dList = new DeleteEnd();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        //Printing original list
        System.out.println("Original List: ");
        dList.display();
        while(dList.head != null) {
            dList.deleteFromEnd();
            //Printing updated list
            System.out.println("Updated List: ");
            dList.display();
        }
    }
*/
}
