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
Reversed List: 5 4 3 2 1

In this program, we create a doubly linked list, then reverse the list by reversing the direction of the list and print out the nodes.

Traverse through the list by swapping the previous pointer with next pointer of each node. Then, swap the position of head and tail node that is, head of the original list will become tail of new list and tail of the original list will become head of the new list. So, the reversed list will be:

Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating a doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	addNode() will add node to the list:
1.	It first checks whether the head is null, then it will insert the node as the head.
2.	Both head and tail will point to a newly added node.
3.	Head's previous pointer will point to null and tail's next pointer will point to null.
4.	If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
5.	The new node will become the new tail. Tail's next pointer will point to null.
4.	reverse() will reverse the given doubly linked list.
1.	Define a node current which will initially point to head.
2.	Traverse through the list by making current to point to current.next in each iteration till current points to null.
3.	In each iteration, swap previous and next pointer of each node to reverse the direction of the list.
4.	In the end, swap the position of head and tail.
5.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current points to null.
3.	Current will point to the next node in the list in each iteration.

*/
public class CreateDLLReverse {
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

    //reverse() will reverse the doubly linked list
    public void reverse() {
        //Node current will point to head
        Node current = head, temp = null;

        //Swap the previous and next pointers of each node to reverse the direction of the list
        while(current != null) {
            temp = current.next;
            current.next = current.previous;
            current.previous = temp;
            current = current.previous;
        }
        //Swap the head and tail pointers.
        temp = head;
        head = tail;
        tail = temp;
    }

    //display() will print out the elements of the list
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
    }

    public static void main(String[] args) {

        ReverseList dList = new ReverseList();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        System.out.println("Original List: ");
        dList.display();

        //Reverse the given list
        dList.reverse();

        //Displays the reversed list
        System.out.println("\nReversed List: ");
        dList.display();
    }
*/
}
