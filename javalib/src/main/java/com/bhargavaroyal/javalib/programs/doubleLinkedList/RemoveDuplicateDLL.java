package com.bhargavaroyal.javalib.programs.doubleLinkedList;
/*Input:
#Add nodes to the list
dList.addNode(1);
dList.addNode(2);
dList.addNode(3);
dList.addNode(2);
dList.addNode(2);
dList.addNode(4);
dList.addNode(5);
dList.addNode(3);
Output:
Originals list: 1 2 3 2 2 4 5 3
List after removing duplicates: 1 2 3 4 5

In this program, we will create a doubly linked list and remove the duplicate, if present, by traversing through the list.
Original List:

List after removing duplicates:

In above list, node2 is repeated thrice, and node 3 is repeated twice. Current will point to head, and index will point to node next to current. Start traversing the list till a duplicate is found that is when current's data is equal to index's data. In above example, the first duplicate will be found at position 4. Assign index to another node temp. Connect index's previous node with index's next node. Delete temp which was pointing to duplicate node. This process will continue till all duplicates are removed.
Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating a doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	addNode() will add node to the list:
1.	It first checks whether the head is null, then it will insert the node as the head.
2.	Both head and tail will point to a newly added node.
3.	Head's previous pointer will point to null and tail's next pointer will point to null.
4.	If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
5.	The new node will become the new tail. Tail's next pointer will point to null.
4.	removeDuplicateNode() will remove duplicate nodes from the list.
1.	Define a new node current which will initially point to head.
2.	Node index will always point to node next to current.
3.	Loop through the list until current points to null.
4.	Check whether current?s data is equal to index's data that means index is duplicate of current.
5.	Node temp will point to index to store duplicate node.
6.	The previous node to the index will point to next node to index.
7.	Since, temp is pointing to index, which is a duplicate node, so set temp to null.
5.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current points to null.
3.	Current will point to the next node in the list in each iteration.
*/
public class RemoveDuplicateDLL {
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

    //removeDuplicateNode() will remove duplicate nodes from the list
    public void removeDuplicateNode() {
        //Node current will point to head
        Node current, index, temp;

        //Checks whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Initially, current will point to head node
            for(current = head; current != null; current = current.next) {
                //index will point to node next to current
                for(index = current.next; index != null; index = index.next) {
                    if(current.data == index.data) {
                        //Store the duplicate node in temp
                        temp = index;
                        //index's previous node will point to node next to index thus, removes the duplicate node
                        index.previous.next = index.next;
                        if(index.next != null)
                            index.next.previous = index.previous;
                        //Delete duplicate node by making temp to null
                        temp = null;
                    }
                }
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

        RemoveDuplicate dList = new RemoveDuplicate();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(2);
        dList.addNode(2);
        dList.addNode(4);
        dList.addNode(5);
        dList.addNode(3);

        System.out.println("Originals list: ");
        dList.display();

        //Removes duplicate nodes
        dList.removeDuplicateNode();

        System.out.println("List after removing duplicates: ");
        dList.display();
    }
*/
}
