package com.bhargavaroyal.javalib.programs.doubleLinkedList;
/*Input:
#Add nodes to the list
dList.addNode(1);
dList.addNode(5);
dList.addNode(4);
dList.addNode(2);
dList.addNode(3);
Output:
Node is present in the list at the position : 3
Node is not present in the list
In this program, we need to search a given node in a doubly linked list.

To solve this problem, we will traverse through the list using a node current. Current points to head and start comparing searched node data with current node data. If they are equal, set the flag to true and print the message along with the position of the searched node.
For, eg. In above list, a search node says 4 can be found at the position 3.
Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating a doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	addNode() will add node to the list:
1.	It first checks whether the head is null, then it will insert the node as the head.
2.	Both head and tail will point to a newly added node.
3.	Head's previous pointer will point to null and tail's next pointer will point to null.
4.	If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
5.	The new node will become the new tail. Tail's next pointer will point to null.
4.	searchNode() will search for a node in the list:
1.	Variable i will keep track of the position of the searched node.
2.	The variable flag will store boolean value false.
3.	Current will point to head node.
4.	Iterate through the loop by incrementing current to current.next and i to i + 1.
5.	Compare each node's data with the searched node. If a match is found, set flag to true.
6.	If the flag is true, prints the position of the searched node.
7.	Else, print the message "Element is not present in the list".
*/
public class SearchElementDLL {
/*  //Represent a node of the doubly linked list

    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    //Represent the head and tail of the doubly linked list
    Node head, tail = null;

    //addNode() will add a node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //If list is empty
        if(head == null) {
            //Both head and tail will point to newNode
            head = tail = newNode;
            //head's previous will point to null
            head.previous = null;
            //tail's next will point to null, as it is the last node of the list
            tail.next = null;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode's previous will point to tail
            newNode.previous = tail;
            //newNode will become new tail
            tail = newNode;
            //As it is last node, tail's next will point to null
            tail.next = null;
        }
    }

    //searchNode() will search a given node in the list
    public void searchNode(int value) {
        int i = 1;
        boolean flag = false;
        //Node current will point to head
        Node current = head;

        //Checks whether the list is empty
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            //Compare value to be searched with each node in the list
            if(current.data == value) {
                flag = true;
                break;
            }
            current = current.next;
            i++;
        }
        if(flag)
             System.out.println("Node is present in the list at the position : " + i);
        else
             System.out.println("Node is not present in the list");
    }

    public static void main(String[] args) {

        SearchList dList = new SearchList();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(5);
        dList.addNode(4);
        dList.addNode(2);
        dList.addNode(3);

        //Search for node 4 in the list
        dList.searchNode(4);
        //Search for node 9 in the list
        dList.searchNode(9);
    }
*/
}
