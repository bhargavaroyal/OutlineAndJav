package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Consider the above example; Node was the head of the list. Make head to point to next node in the list. Now, node 1 will become the new head of the list. Thus, deleting the Node.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class DeleteStart which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	deleteFromStart() will delete a node from the beginning of the list:
1.	It first checks whether the head is null (empty list) then, display the message "List is empty" and return.
2.	If the list is not empty, it will check whether the list has only one node.
3.	If the list has only one node, it will set both head and tail to null.
4.	If the list has more than one node then, the head will point to the next node in the list and delete the old head node.
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/

public class DeleteNodeFromBeginningLinkedList {
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

    //deleteFromStart() will delete a node from the beginning of the list
    public void deleteFromStart() {

        //Checks if the list is empty
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            //Checks whether the list contains only one node
            //If not, the head will point to next node in the list and tail will point to the new head.
            if(head != tail) {
                head = head.next;
            }
            //If the list contains only one node
            //then, it will remove it and both head and tail will point to null
            else {
                head = tail = null;
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

        DeleteStart sList = new DeleteStart();

        //Adds data to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Printing original list
        System.out.println("Original List: ");
        sList.display();

        while(sList.head != null) {
            sList.deleteFromStart();
            //Printing updated list
            System.out.println("Updated List: ");
            sList.display();
        }
    }
*/
}
