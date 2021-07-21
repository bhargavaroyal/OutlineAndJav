package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adding 1 to the list
cl.addAtEnd(1);
#Adding 2 to the list
cl.addAtEnd(2);
#Adding 3 to the list
cl.addAtEnd(3);
#Adding 4 to the list
cl.addAtEnd(4);
Output:
Adding nodes to the end of the list: 1
Adding nodes to the end of the list: 1 2
Adding nodes to the end of the list: 1 2 3
Adding nodes to the end of the list: 1 2 3 4

In this program, we will create a circular linked list and insert every new node at the end of the list. If the list is empty, then head and tail will point to the newly added node. If the list is not empty, the newly added node will become the new tail of the list. The previous tail will point to new node as its next node. Since it is a circular linked list; the new tail will point to head. In other words, the new node will become last node (tail) of the list, and the previous tail will be the second last node.

After inserting new node to the end of the list

New represents the newly added node. D is the previous tail. When new is added to the end of the list, it will become new tail and D will point to new.
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail. It has two methods: addAtEnd() and display() .
3.	addAtEnd() will add the node to the end of the list:
1.	It first checks whether the head is null (empty list), then it will insert the node as the head.
2.	Both head and tail will point to the newly added node.
3.	If the list is not empty, then the newly added node will become the new tail, and previous tail will point to new node as its next node. The new tail will point to the head.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current will points to head again.
3.	Current will point to the next node in the list in each iteration.
*/
public class InsertNodeEndCLL {
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
        public void addAtEnd(int data){
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
                //Since, it is circular linked list tail will points to head.
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
                System.out.println("Adding nodes to the end of the list: ");
                 do{
                    //Prints each node by incrementing pointer.
                    System.out.print(" "+ current.data);
                    current = current.next;
                }while(current != head);
                System.out.println();
            }
        }

        public static void main(String[] args) {
            InsertAtEnd cl = new InsertAtEnd();

            //Adding 1 to the list
            cl.addAtEnd(1);
            cl.display();
            //Adding 2 to the list
            cl.addAtEnd(2);
            cl.display();
            //Adding 3 to the list
            cl.addAtEnd(3);
            cl.display();
            //Adding 4 to the list
            cl.addAtEnd(4);
            cl.display();
        }
*/
}
