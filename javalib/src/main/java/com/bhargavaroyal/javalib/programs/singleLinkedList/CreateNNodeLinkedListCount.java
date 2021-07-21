package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*To accomplish this task, traverse through the list using node current which initially points to head. Increment current in such a way that current will point to its next node in each iteration and increment variable count by 1. In the end, the count will hold the value which denotes the number of nodes present in the list.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to the newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	countNodes() will count the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Declare and initialize a variable count to 0.
3.	Traverse through the list till current point to null.
4.	Increment the value of count by 1 for each node encountered in the list.
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class CreateNNodeLinkedListCount {
    /*    //Represent a node of singly linked list
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

    //countNodes() will count the nodes present in the list
    public int countNodes() {
        int count = 0;
        //Node current will point to head
        Node current = head;

        while(current != null) {
            //Increment the count by 1 for each node
            count++;
            current = current.next;
        }
        return count;
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

        CountNodes sList = new CountNodes();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Displays the nodes present in the list
        sList.display();

        //Counts the nodes present in the given list
        System.out.println("Count of nodes present in the list: " + sList.countNodes());
    }
*/

}
