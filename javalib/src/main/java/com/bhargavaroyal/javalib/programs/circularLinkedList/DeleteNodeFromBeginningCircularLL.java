package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(1);
cl.add(2);
cl.add(3);
cl.add(4);
Output:
Original List:1 2 3 4
Updated List:2 3 4
Updated List:3 4
Updated List:4
Updated List: List is empty

In this program, we will create a circular linked list and delete a node from the beginning of the list. If the list is empty, print the message "List is empty". If the list is not empty, we will make the head to point to next node in the list, i.e., we will delete the first node.

Circular linked list after deleting node from beginning

Here, A represents the head of the list. We need to delete a node from the beginning of the list. So, we will remove A such that B will become new head and tail will point to the new head.
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail. It has two methods: deleteStart() and display() .
3.	deleteStart() will delete the node from the beginning of the list:
1.	It first checks whether the head is null (empty list) then, it will return from the function as there is no node present in the list.
2.	If the list is not empty, it will check whether list has only one node.
3.	If the list has only one node, it will set both head and tail to null.
4.	If the list has more than one node then, the head will point to the next node in the list that is, we will remove the previous head node and tail will point to the new head.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current will points to head again.
3.	Current will point to the next node in the list in each iteration.
________________________________________
*/
public class DeleteNodeFromBeginningCircularLL {
    /*    //Represents the node of list.
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    //Declaring head and tail pointer as null.
    public Node head = null;
    public Node tail = null;

    //This function will add the new node at the end of the list.
    public void add(int data){
        //Create new node
        Node newNode = new Node(data);
        //Checks if the list is empty.
        if(head == null) {
             //If list is empty, both head and tail would point to new node.
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
            //tail will point to new node.
            tail.next = newNode;
            //New node will become new tail.
            tail = newNode;
            //Since, it is circular linked list tail will point to head.
            tail.next = head;
        }
    }

    //Deletes node from the beginning of the list
    public void deleteStart() {
        //Checks whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Checks whether contain only one element
            //If not, head will point to next element in the list and tail will point to new head.
            if(head != tail ) {
                head = head.next;
                tail.next = head;
            }
            //If the list contains only one element
            //then it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }

    //Displays all the nodes in the list
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
             do{
                //Prints each node by incrementing pointer.
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DeleteStart cl = new DeleteStart();
        //Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        //Printing original list
        System.out.println("Original List: ");
        cl.display();
        while(cl.head != null) {
            cl.deleteStart();
            //Printing updated list
            System.out.println("Updated List: ");
            cl.display();
        }
    }
*/
}
