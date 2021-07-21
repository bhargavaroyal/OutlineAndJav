package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adding 1 to the list
cl.addAtStart(1);
#Adding 2 to the list
cl.addAtStart(2);
#Adding 3 to the list
cl.addAtStart(3);
#Adding 4 to the list
cl.addAtStart(4);
Output:
Adding nodes to the start of the list: 1
Adding nodes to the start of the list: 2 1
Adding nodes to the start of the list: 3 2 1
Adding nodes to the start of the list: 4 3 2 1

In this program, we will create a circular linked list and insert every new node at the beginning of the list. If the list is empty, then head and tail will point to the newly added node. If the list is not empty, then we will store the data of the head into a temporary node temp and make new node as the head. This new head will point to the temporary node. In simple words, the newly added node will be the first node(head) and previous head(temp) will become the second node of the list.

After inserting new node to the beginning of the list

New represents the newly added node. Earlier A was the head of the list. When new is added to the beginning of the list, new will become the new head, and it will point to the previous head, i.e., A.
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail. It has two methods: addAtStart() and display() .
3.	addAtStart() will add the node to the beginning of the list:
1.	It first checks whether the head is null (empty list), then it will insert the node as the head.
2.	Both head and tail will point to newly added node.
3.	If the list is not empty, then the newly added node will become the new head, and it will point to previous head.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current will points to head again.
3.	Current will point to the next node in the list in each iteration.
*/
public class InsertNodeBeginningCLL {
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
        public void addAtStart(int data){
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
                //Store data into temporary node
                Node temp = head;
                //New node will point to temp as next node
                newNode.next = temp;
                //New node will be the head node
                head = newNode;
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
                System.out.println("Adding nodes to the start of the list: ");
                 do{
                    //Prints each node by incrementing pointer.
                    System.out.print(" "+ current.data);
                    current = current.next;
                }while(current != head);
                System.out.println();
            }
        }

        public static void main(String[] args) {
            InsertAtStart cl = new InsertAtStart();

            //Adding 1 to the list
            cl.addAtStart(1);
            cl.display();
            //Adding 2 to the list
            cl.addAtStart(2);
            cl.display();
            //Adding 3 to the list
            cl.addAtStart(3);
            cl.display();
            //Adding 4 to the list
            cl.addAtStart(4);
            cl.display();
        }
*/
}
