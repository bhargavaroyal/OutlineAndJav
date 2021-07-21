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
Updated List: 2 3 4 5
Updated List: 3 4 5
Updated List: 4 5
Updated List: 5
Updated List: List is empty

n this program, we will create a doubly linked list and delete a node from the beginning of the list. If the list is empty, print the message "List is empty". If the list is not empty, we will make the head to point to next node in the list then; we will delete the first node.

Consider the above example, new was the head of the list. Make head to point to next node in the list. Now, node 1 will become the new head of the list thus, deleting node new.
Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating a doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	deleteFromStart() will delete a node from the beginning of the list:
1.	It first checks whether the head is null (empty list) then, it will return from the function as there is no node present in the list.
2.	If the list is not empty, it will check whether the list has only one node.
3.	If the list has only one node, it will set both head and tail to null.
4.	If the list has more than one node then, the head will point to next node in the list and delete the old head node.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current points to null.
3.	Current will point to the next node in the list in each iteration.
*/
public class DeleteNodeFromBeginningDLL {
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

    //deleteFromStart() will delete a node from the beginning of the list
    public void deleteFromStart() {
        //Checks whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Checks whether the list contains only one element
            if(head != tail) {
                //head will point to next node in the list
                head = head.next;
                //Previous node to current head will be made null
                head.previous = null;
            }
            //If the list contains only one element
            //then, it will remove node and now both head and tail will point to null
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

        DeleteStart dList = new DeleteStart();
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
            dList.deleteFromStart();
            //Printing updated list
            System.out.println("Updated List: ");
            dList.display();
        }
    }
*/
}
