package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(1);
cl.add(2);
cl.add(3);
cl.add(4);
Output:
Nodes of the circular linked list: 1 2 3 4
The circular linked list is a kind of linked list. First thing first, the node is an element of the list, and it has two parts that are, data and next. Data represents the data stored in the node and next is the pointer that will point to next node. Head will point to the first element of the list, and tail will point to the last element in the list. In the simple linked list, all the nodes will point to their next element and tail will point to null.
The circular linked list is the collection of nodes in which tail node also point back to head node. The diagram shown below depicts a circular linked list. Node A represents head and node D represents tail. So, in this list, A is pointing to B, B is pointing to C and C is pointing to D but what makes it circular is that node D is pointing back to node A.

Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail. It has two methods: add() and display() .
3.	add() will add the node to the list:
1.	It first checks whether the head is null, then it will insert the node as the head.
2.	Both head and tail will point to the newly added node.
3.	If the head is not null, the new node will be the new tail, and the new tail will point to the head as it is a circular linked list.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current will points to head
3.	Current will point to the next node in the list in each iteration.
*/
public class DisplayCircularLinkedList {
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

    //Displays all the nodes in the list
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
             do{
                //Prints each node by incrementing pointer.
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CreateList cl = new CreateList();
        //Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        //Displays all the nodes present in the list
        cl.display();
    }
*/
}
