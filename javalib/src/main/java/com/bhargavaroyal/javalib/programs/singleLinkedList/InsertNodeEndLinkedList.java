package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Input:
#Adding 1 to the list
sList.addAtEnd(1);
#Adding 2 to the list
sList.addAtEnd(2);
#Adding 3 to the list
sList.addAtEnd(3);
#Adding 4 to the list
sList.addAtEnd(4);
Output:
Adding nodes to the end of the list: 1
Adding nodes to the end of the list: 1 2
Adding nodes to the end of the list: 1 2 3
Adding nodes to the end of the list: 1 2 3 4

In this program, we will create a singly linked list and add a new node at the end of the list. To accomplish this task, add a new node after the tail of the list such that tail's next will point to the newly added node. Then, make this new node as the new tail of the list.

Consider the above list; node 4 represents the tail of the original list. Let node New is the new node which needs to be added at the end of the list. Make 4's next to point to New. Make New as the new tail of the list.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class InsertEnd which has two attributes: head and tail.
3.	addAtEnd() will add a new node at the end of the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class InsertNodeEndLinkedList {
/*    //Represent a node of the singly linked list
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

    //addAtEnd() will add a new node to the end of the list
    public void addAtEnd(int data) {
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
        System.out.println("Adding nodes to the end of the list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertEnd sList = new InsertEnd();

        //Adding 1 to the list
        sList.addAtEnd(1);
        sList.display();

        //Adding 2 to the list
        sList.addAtEnd(2);
        sList.display();

        //Adding 3 to the list
        sList.addAtEnd(3);
        sList.display();

        //Adding 4 to the list
        sList.addAtEnd(4);
        sList.display();
    }
*/
}
