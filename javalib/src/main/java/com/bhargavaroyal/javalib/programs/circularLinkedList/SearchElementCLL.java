package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(1);
cl.add(2);
cl.add(3);
cl.add(4);
#Search for node 2 in the list
cl.search(2);
#Search for node in the list
cl.search(7);
Output:
Element is present in the list at the position : 2
Element is not present in the list

In this program, we create a circular linked list and search a node in the list.
9->5->2->7->3
Consider, above example. Suppose we need to search for node 5. To solve this problem, we will iterate through the list and compare each node with 5. If match is found, we will set the flag to true and prints out the position of the node 5. In this example, node 5 is present at the position 2.
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating circular linked list and it has two nodes: head and tail.
3.	search() will search for a node in the list:
1.	Variable i will keep track of the position of the searched node.
2.	Variable flag will store boolean value false.
3.	Current will point to head node.
4.	Iterate through the loop by incrementing current to current.next and i to i + 1.
5.	Compare each node's data with searched node. If match is found, set flag to true.
6.	If flag is true, prints the position of searched node.
7.	Else, print the message "Element is not present in the list".
*/
public class SearchElementCLL {
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

    //Searches for a node in the list
    public void search(int element) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        //Checks whether list is empty
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
             do{
                 //Compares element to be found with each node present in the list
                if(current.data ==  element) {
                    flag = true;
                    break;
                }
                current = current.next;
                i++;
            }while(current != head);
             if(flag)
                 System.out.println("Element is present in the list at the position : " + i);
            else
                 System.out.println("Element is not present in the list");
        }
    }

    public static void main(String[] args) {
        SearchNode cl = new SearchNode();
        //Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        //Search for node 2 in the list
        cl.search(2);
        //Search for node in the list
        cl.search(7);
    }
*/
}
