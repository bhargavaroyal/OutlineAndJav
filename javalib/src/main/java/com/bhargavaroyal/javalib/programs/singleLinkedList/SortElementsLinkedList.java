package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Input:
#Adds data to the list
sList.addNode(9);
sList.addNode(7);
sList.addNode(2);
sList.addNode(5);
sList.addNode(4);
Output:
Original list: 9 7 2 5 4
Sorted list: 2 4 5 7 9

Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class SortList which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	sortList() will sort the nodes of the list in ascending order.
1.	Define a node current which will point to head.
2.	Define another node index which will point to node next to current.
3.	Compare data of current and index node. If current's data is greater than the index's data then, swap the data between them.
4.	Current will point to current.next and index will point to index.next.
5.	Continue this process until the entire list is sorted.
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.

*/
public class SortElementsLinkedList {
    /*//Represent a node of the singly linked list
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

    //sortList() will sort nodes of the list in ascending order
    public void sortList() {
        //Node current will point to head
        Node current = head, index = null;
        int temp;

        if(head == null) {
            return;
        }
        else {
            while(current != null) {
                //Node index will point to node next to current
                index = current.next;

                while(index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
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

        SortList sList = new SortList();

        //Adds data to the list
        sList.addNode(9);
        sList.addNode(7);
        sList.addNode(2);
        sList.addNode(5);
        sList.addNode(4);

        //Displaying original list
        System.out.println("Original list: ");
        sList.display();

        //Sorting list
        sList.sortList();

        //Displaying sorted list
        System.out.println("Sorted list: ");
        sList.display();
    }
*/
}
