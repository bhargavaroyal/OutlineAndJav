package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(1);
cl.add(2);
cl.add(3);
cl.add(4);
Output:
Original List:1 2 3 4
Updated List:1 2 3
Updated List:1 2
Updated List:1
Updated List: List is empty

In this program, we will create a circular linked list and delete a node from the end of the list. If the list is empty, it will display the message "List is empty". If the list is not empty, we will loop through the list till second last node is reached. We will make second last node as the new tail, and this new tail will point to head and delete the previous tail.

Circular linked list after deleting node from end

Here, in the above list, D is the last node which needs to be deleted. We will iterate through the list till C. Make C as new tail and C will point back to head A.
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail. It has two methods: deleteEnd() and display() .
3.	deleteEnd() will delete the node from the end of the list:
1.	It first checks whether the head is null (empty list) then, it will return from the function as there is no node present in the list.
2.	If the list is not empty, it will check whether list has only one node.
3.	If the list has only one node, it will set both head and tail to null.
4.	If the list has more than one node then, iterate through the loop till current.next!= tail.
5.	Now, current will point to the node previous to tail. Make current as new tail and tail will point to head thus, deletes the node from last.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current will points to head again.
3.	Current will point to the next node in the list in each iteration.
*/
public class DeleteNodeFRomEndCLL {
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

    //Deletes node from end of the list
    public void deleteEnd() {
        //Checks whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Checks whether contain only one element
            if(head != tail ) {
                Node current = head;
                //Loop will iterate till the second last element as current.next is pointing to tail
                while(current.next != tail) {
                    current = current.next;
                }
                //Second last element will be new tail
                tail = current;
                //Tail will point to head as it is a circular linked list
                tail.next = head;
            }
            //If the list contains only one element
            //Then it will remove it and both head and tail will point to null
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
        DeleteEnd cl = new DeleteEnd();
        //Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        //Printing original list
        System.out.println("Original List: ");
        cl.display();
        while(cl.head != null) {
            cl.deleteEnd();
            //Printing updated list
            System.out.println("Updated List: ");
            cl.display();
        }
    }
*/
}
