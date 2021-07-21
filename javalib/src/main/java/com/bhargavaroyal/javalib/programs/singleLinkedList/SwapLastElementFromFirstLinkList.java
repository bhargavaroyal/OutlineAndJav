package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Input:
#Add nodes to the list
sList.addNode(1);
sList.addNode(2);
sList.addNode(3);
sList.addNode(4);
Output:
Originals list: 1 2 3 4
List after swapping the first node with last: 4 2 3 1
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class Swap which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	SwapFirstWithLast() will swap the first node with the last node:
1.	If the list is empty, return from the function.
2.	If the list is not empty, traverse through the list such that node current will point to the last node of the list and index will point to second last node.
3.	Check if the list contains only one node, then swapping is not possible.
4.	If the list contains only two nodes then, swap head node with current using node temp.
5.	Else, the temp will point to head, and current which was pointing to the last node will become the new head of the list.
6.	Move the list except for the old head node and attach it after new head, i.e. head.next = temp.next
7.	Now add the temp (first) node after index node to make it last node of the list and its next node will be null.
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class SwapLastElementFromFirstLinkList {
/*    //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head of the singly linked list
    public Node head = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, head will point to new node
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            //newNode will be added after last node of the list
            current.next = newNode;
        }
    }

    //swapLastWithFirst() will swap head node with the last node of the list
    public void swapLastWithFirst() {
        Node current = head, temp = null, index = null;

        //If list is empty, then display the list as it is
        if(head == null) {
            return;
        }
        else {
            //After the loop, current will point to last element and index will point to second last element
            while(current.next != null) {
                index = current;
                current = current.next;
            }

            //If list contains only one node, then display list as it is
            if(head == current) {
                return;
            }
            //If list contains only two nodes, then swap the head node with current node
            else if(head.next == current) {
                temp = head;
                //head will point to last node i.e. current
                head = current;
                //node next to new head will be the last node
                head.next = temp;
                //Node next to last element will be null
                temp.next = null;
            }
            else {
                temp = head;
                //head will point to last node i.e. current
                head = current;
                //Detach the list from previous head and add it after new head
                head.next = temp.next;
                //Previous head will become last node of the list
                index.next = temp;
                //Node next to last element will be null
                temp.next = null;
            }
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Swap sList = new Swap();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        System.out.println("Originals list: ");
        sList.display();

        //Swaps Last node with first node
        sList.swapLastWithFirst();

        System.out.println("List after swapping the first node with last: ");
        sList.display();
    }
*/
}
