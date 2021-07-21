package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Input:
#Add nodes to the list
sList.addNode(1);
sList.addNode(2);
sList.addNode(3);
sList.addNode(4);
sList.addNode(5);
#Swaps the node 2 with node 5
sList.swap(2,5);
Output:
Original list: 1 2 3 4 5
List after swapping nodes: 1 5 3 4 2

Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class SwapNodes which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	swap() will swap the given two nodes present in the list:
1.	Let n1 and n2 be the values need to be swapped.
2.	If the list is empty then, return from the function.
3.	If n1 and n2 are equal then, there will be no change in the list.
4.	If the list is not empty then, search for n1 by traversing through the list such that prevNode1 which will point to node previous to node1 and node 1 will point to the node having value n1.
5.	Similarly, search for n2 by traversing through the list such that prevNode2 which will point to node previous to node2 and node 2 will point to the node having value n2.
6.	If prevNode1 points to head then, node2 will become head of the list. Similarly, if prevNode2 points to head then, node1 will become head of the list.
7.	If prevNode1 or prevNode2 is not pointing to head then, swap the nodes such that prevNode1 will become the previous node of node2 and prevNode2 will become the previous node of node1.
8.	Now, swap next nodes of node1 and node2.
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class SwapNodesWithoutDataLinkedList {
/*    //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //swap() will swap the given two nodes
    public void swap(int n1, int n2){
        Node prevNode1 = null, prevNode2 = null, node1 = head, node2 = head;

        //Checks if list is empty
        if(head == null) {
            return;
        }

        //If n1 and n2 are equal, then list will remain the same
        if(n1 == n2)
            return;

        //Search for node1
        while(node1 != null && node1.data != n1){
            prevNode1 = node1;
            node1 = node1.next;
        }

        //Search for node2
        while(node2 != null && node2.data != n2){
            prevNode2 = node2;
            node2 = node2.next;
        }

        if(node1 != null && node2 != null) {

            //If previous node to node1 is not null then, it will point to node2
            if(prevNode1 != null)
                prevNode1.next = node2;
            else
                head  = node2;

            //If previous node to node2 is not null then, it will point to node1
            if(prevNode2 != null)
                prevNode2.next = node1;
            else
                head  = node1;

            //Swaps the next nodes of node1 and node2
            Node temp = node1.next;
            node1.next = node2.next;
            node2.next = temp;
        }
        else {
            System.out.println("Swapping is not possible");
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

        SwapNodes sList = new SwapNodes();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);

        System.out.println("Original list: ");
        sList.display();

        //Swaps the node 2 with node 5
        sList.swap(2,5);

        System.out.println("List after swapping nodes: ");
        sList.display();
    }
*/
}
