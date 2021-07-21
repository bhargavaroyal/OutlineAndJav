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
Updated List: 4 5 1 2 3
In this program, we need to create a doubly linked list and rotate it by n node. This can be achieved by maintaining a pointer that starts from the head node and traverses the list until current points to the nth node. Move the list from head to the nth node and place it after tail. Now nth node will be the tail of the list and node next to nth node will be the new head. Here, n should always be greater than 0 but less than the size of the list.
Original List:

List after rotating it by 3 nodes:

In the above example, we need to rotate list by 3 nodes. First, we iterate through the list until current points to the 3rd node which is, in this case, are node 3. Move the list from node 1 to 3 and place it after tail. Now, node 4 will be new head and node 3 will be the new tail.
Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating the doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	addNode() will add node to the list:
1.	It first checks whether the head is null, then it will insert the node as the head.
2.	Both head and tail will point to a newly added node.
3.	Head's previous pointer will point to null and tail's next pointer will point to null.
4.	If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
5.	The new node will become the new tail. Tail's next pointer will point to null.
4.	rotateList() will rotate the list by given n nodes.
1.	First, check whether n is 0 or greater than or equal to many nodes present in the list.
2.	If yes, print the list as it is.
3.	If no, define a node current which will point to head.
4.	Iterate through the list till current reaches the nth node.
5.	Tail's next will point to head node.
6.	Make node next to current as the new head. Head's previous will point to null.
7.	The current node will become tail of the list. Tail's next will point to null.
5.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current points to null.
3.	Current will point to the next node in the list in each iteration.
*/
public class RotateDLL {
/*//Represent a node of the doubly linked list

    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    int size = 0;
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
        //Size will count the number of nodes present in the list
        size++;
    }

    //rotateList() will rotate the list by given n nodes
    public void rotateList(int n) {
        //Initially, current will point to head
        Node current = head;

        //n should not be 0 or greater than or equal to number of nodes present in the list
        if(n == 0 || n >= size)
            return;
        else {
            //Traverse through the list till current point to nth node
            //after this loop, current will point to nth node
            for(int i = 1; i < n; i++)
                current = current.next;

            //Now to move entire list from head to nth node and add it after tail
            tail.next = head;
            //Node next to nth node will be new head
            head = current.next;
            //Previous node to head should be null
            head.previous = null;
            //nth node will become new tail of the list
            tail = current;
            //tail's next will point to null
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
        while(current != null) {
            //Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        RotateList dList = new RotateList();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        System.out.println("Original List: ");
        dList.display();

        //Rotates list by 3 nodes
        dList.rotateList(3);

        System.out.println("Updated List: ");
        dList.display();
    }
*/
}
