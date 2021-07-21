package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(1);
cl.add(2);
cl.add(4);
cl.add(1);
cl.add(2);
cl.add(3);
Output:
Count of nodes present in circular linked list: 6
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail. It has two methods: add() and display() .
3.	add() will add the node to the list:
1.	It first checks whether size is null or head is null; then it will insert the node as the head.
2.	Both head and tail will point to a newly added node.
3.	If the head is not null, the new node will be the new tail, and new tail will point to the head as it is a circular linked list.
4.	countNodes() will count the number of nodes present in the list.
1.	Define new node current which will point to the head node.
2.	Traverse through the list to count the nodes by making the current node to point to next node in the list till current points to head again.

*/
public class CreateCircularLinkedList {
/*        //Represents the node of list.
        public class Node{
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
            }
        }

        public int count;
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

        //This function will count the nodes of circular linked list
        public void countNodes() {
            Node current = head;
            do{
                //Increment the count variable by 1 for each node
                count++;
                current = current.next;
            }while(current != head);
            System.out.println("Count of nodes present in circular linked list: "+count);
        }

        public static void main(String[] args) {
            CountNodes cl = new CountNodes();
            cl.add(1);
            cl.add(2);
            cl.add(4);
            cl.add(1);
            cl.add(2);
            cl.add(3);
            //Counts the number of nodes present in the list
            cl.countNodes();
        }
*/
}
