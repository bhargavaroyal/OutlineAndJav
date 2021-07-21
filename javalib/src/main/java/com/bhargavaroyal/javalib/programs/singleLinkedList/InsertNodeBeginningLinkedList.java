package com.bhargavaroyal.javalib.programs.singleLinkedList;

/*Input:
#Adding 1 to the list
sList.addAtStart(1);
#Adding 2 to the list
sList.addAtStart(2);
#Adding 3 to the list
sList.addAtStart(3);
#Adding 4 to the list
sList.addAtStart(4);
Output:
Adding nodes to the start of the list: 1
Adding nodes to the start of the list: 2 1
Adding nodes to the start of the list: 3 2 1
Adding nodes to the start of the list: 4 3 2 1
To accomplish this task, we will store head to a temporary node temp. Make newly added node as the new head of the list. Then, add temp (old head) after new head.

Consider the above list; node 1 represents the head of the original list. Let node New be the new node which needs to be added at the beginning of the list. Node temp will point to head, i.e. 1. Make New as the new head of the list and add temp after new head such that node next to New will be 1.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class InsertStart which has two attributes: head and tail.
3.	addAtStart() will add a new node to the beginning of the list:
1.	It first checks, whether the head is equal to null which means the list is empty.
2.	If the list is empty, both head and tail will point to a newly added node.
3.	If the list is not empty then, create temporary node temp will point to head.
4.	Add the new node as head of the list.
5.	Temp which was pointing to the old head will be added after the new head.
4.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class InsertNodeBeginningLinkedList {
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

    //addAtStart() will add a new node to the beginning of the list
    public void addAtStart(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //Node temp will point to head
            Node temp = head;
            //newNode will become new head of the list
            head = newNode;
            //Node temp(previous head) will be added after new head
            head.next = temp;
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
        System.out.println("Adding nodes to the start of the list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertStart sList = new InsertStart();

        //Adding 1 to the list
        sList.addAtStart(1);
        sList.display();

        //Adding 2 to the list
        sList.addAtStart(2);
        sList.display();

        //Adding 3 to the list
        sList.addAtStart(3);
        sList.display();

        //Adding 4 to the list
        sList.addAtStart(4);
        sList.display();
    }
*/
}
