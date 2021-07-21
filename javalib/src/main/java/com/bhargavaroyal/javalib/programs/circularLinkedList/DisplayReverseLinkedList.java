package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(1);
cl.add(2);
cl.add(3);
cl.add(4);
cl.add(5);
cl.add(6);
Output:
Original List: 1 2 3 4 5 6
Reversed List: 6 5 4 3 2 1

Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail. It has two methods: add(), display() and reverse().
3.	add() will add a node to the list:
1.	It first checks whether the head is null, then it will insert the node as the head.
2.	Both head and tail will point to the newly added node.
3.	If the head is not null, the new node will be the new tail, and new tail will point to head as it is a circular linked list.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current will points to head again.
3.	Current will point to the next node in the list in each iteration.
5.	reverse() will print the circular linked list in reverse order.
1.	This method checks whether next node to current is head which implies that, current is pointing to tail, then it will print the data of the tail node.
2.	Recursively call reverse() by considering node next to current node and prints out all the nodes in reverse order starting from the tail.
*/
public class DisplayReverseLinkedList {
/*            //Represents the node of list.
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
                     do{
                        //Prints each node by incrementing pointer.
                        System.out.print(" "+ current.data);
                        current = current.next;
                    }while(current != head);
                    System.out.println();
                }
            }

            //Reverse the order of the nodes present in the list.
            public void reverse(Node current) {
                //Checks if the next node is head, if yes then prints it.
                if(current.next == head) {
                    System.out.print(" "+current.data);
                    return;
                }
                //Recursively calls the reverse function
                reverse(current.next);
                System.out.print(" "+current.data);
            }

            public static void main(String[] args) {
                ReverseList cl = new ReverseList();
                cl.add(1);
                cl.add(2);
                cl.add(3);
                cl.add(4);
                cl.add(5);
                cl.add(6);
                System.out.println("Original List: ");
                cl.display();
                System.out.println("Reversed List: ");
                //Print reversed list
                cl.reverse(cl.head);
            }
*/
}
