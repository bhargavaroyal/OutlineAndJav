package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(1);
cl.add(2);
cl.add(3);
cl.add(4);
Output:
Original List:1 2 3 4
Updated List:1 3 4
Updated List:1 4
Updated List:4
Updated List: List is empty

In this program, we will create a circular linked list and delete a node from the middle of the list. If the list is empty, display the message "List is empty". If the list is not empty, we will calculate the size of the list and then divide it by 2 to get the mid-point of the list. We maintain two pointers temp and current. Current will point to the previous node of temp. We will iterate through the list until mid-point is reached then the current will point to the middle node. We delete middle node such that current's next will be temp's next node.

Circular linked list after deleting node from middle of the list

Consider the above list. Size of the list is 4. Mid-point of the node is 2. To remove C from the list, we will iterate through the list till mid-point. Now current will point to B and temp will point to C. C will be removed when B will point to D.
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail. It has a variable size and two methods: deleteMid() and display() .
3.	deleteMid() will delete the node from the middle of the list:
1.	It first checks whethe the head is null (empty list) then, it will return from the function as there is no node present in the list.
2.	If the list is not empty, it will check whether the list has only one node.
3.	If the list has only one node, it will set both head and tail to null.
4.	If the list has more than one node then, it will calculate the size of the list. Divide the size by 2 and store it in the variable count.
5.	Temp will point to head, and current will point to the previous node to temp.
6.	Iterate the list till current will point middle node of the list.
7.	Current will point to node next to temp, i.e., removes the node next to current.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current will points to head again.
3.	Current will point to the next node in the list in each iteration.
*/
public class DeleteNodeMiddleCLL {
/*    //Represents the node of list.
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public int size;
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
        //Counts the number of nodes in list
        size++;
    }

    //Deletes node from the middle of the list
    public void deleteMid() {
        Node current, temp;
        //Checks whether list is empty
        if(head == null) {
            return;
        }
        else {
            //Store the mid position of the list
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);
            //Checks whether head is equal to tail or not, if yes then list has only one node.
            if( head != tail ) {
                //Initially temp will point to head;
                temp = head;
                current = null;
                //Current will point to node previous to temp
                //If temp is pointing to node 2 then current will points to node 1.
                for(int i = 0; i < count-1; i++){
                    current = temp;
                    temp = temp.next;
                }

                if(current != null) {
                    //temp is the middle that needs to be removed.
                    //So, current node will point to node next to temp by skipping temp.
                    current.next = temp.next;
                    //Delete temp;
                    temp = null;
                }
                //Current points to null then head and tail will point to node next to temp.
                else {
                    head = tail = temp.next;
                    tail.next = head;
                    //Delete temp;
                    temp = null;
                }

            }
            //If the list contains only one element
            //then it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
        }
        size--;
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
        DeleteMid cl = new DeleteMid();
        //Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        //Printing original list
        System.out.println("Original List: ");
        cl.display();
        while(cl.head != null) {
            cl.deleteMid();
            //Printing updated list
            System.out.println("Updated List: ");
            cl.display();
        }
    }
*/
}
