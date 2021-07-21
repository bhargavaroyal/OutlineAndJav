package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Input:
#Add nodes to the list
sList.addNode(1);
sList.addNode(2);
sList.addNode(3);
sList.addNode(4);
Output:
Original List: 1 2 3 4
Updated List: 1 2 3
Updated List: 1 2
Updated List: 1
Updated List: List is empty
*/
/*we first find out the second last node of the list. Then, make second last node as the new tail of the list. Then, delete the last node of the list.

In the above example, Node was the tail of the list. Traverse through the list to find out the second last node which in this case is node 4. Make node 4 as the tail of the list. Node 4's next will point to null.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class DeleteEnd which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	DeleteFromEnd() will delete a node from the end of the list:
1.	It first checks whether the head is null (empty list) then, display the message "List is empty" and return.
2.	If the list is not empty, it will check whether the list has only one node.
3.	If the list has only one node, it will set both head and tail to null.
4.	If the list has more than one node then, traverse through the list till node current points to second last node in the list.
5.	Node current will become the new tail of the list.
6.	Node next to current will be made null to delete the last node.
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class DeleteNodeFromEndLinkedList {
/*public class DeleteEnd {

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

    //deleteFromEnd() will delete a node from end of the list
    public void deleteFromEnd() {

        //Checks if the list is empty
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            //Checks whether the list contains only one element
            if(head != tail ) {
                Node current = head;
                //Loop through the list till the second last element such that current.next is pointing to tail
                while(current.next != tail) {
                    current = current.next;
                }
                //Second last element will become new tail of the list
                tail = current;
                tail.next = null;
            }
            //If the list contains only one element
            //Then it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
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
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DeleteEnd sList = new DeleteEnd();

        //Adds data to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Printing original list
        System.out.println("Original List: ");
        sList.display();

        while(sList.head != null) {
            sList.deleteFromEnd();
            //Printing updated list
            System.out.println("Updated List: ");
            sList.display();
        }
    }
}
*/
}
