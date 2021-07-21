package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Input:
#Adds data to the list
sList.addNode(1);
sList.addNode(2);
sList.addNode(3);
sList.addNode(2);
sList.addNode(2);
sList.addNode(4);
sList.addNode(1);
Output:
Originals list: 1 2 3 2 2 4 1
List after removing duplicates: 1 2 3 4

Node current will point to head, and index will point to node next to current. Start traversing the list till a duplicate is found that is when current's data is equal to index's data. In the above example, the first duplicate will be found at position 4. Assign current to another node temp. Connect temp's next node with index's next node. Delete index which was pointing to duplicate node. This process will continue until all duplicates are removed.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class RemoveDuplicate which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	removeDuplicate() will remove duplicate nodes from the list.
1.	Define a new node current which will initially point to head.
2.	Node temp will point to current and index will always point to node next to current.
3.	Loop through the list till current points to null.
4.	Check whether current?s data is equal to index's data that means index is duplicate of current.
5.	Since index points to duplicate node so skip it by making node next to temp to will point to node next to index, i.e. temp.next = index.next.
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class RemoveDuplicateElementLinkedList {
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

    //removeDuplicate() will remove duplicate nodes from the list
    public void removeDuplicate() {
        //Node current will point to head
        Node current = head, index = null, temp = null;

        if(head == null) {
            return;
        }
        else {
            while(current != null){
                //Node temp will point to previous node to index.
                temp = current;
                //Index will point to node next to current
                index = current.next;

                while(index != null) {
                    //If current node's data is equal to index node's data
                    if(current.data == index.data) {
                        //Here, index node is pointing to the node which is duplicate of current node
                        //Skips the duplicate node by pointing to next node
                        temp.next = index.next;
                    }
                    else {
                        //Temp will point to previous node of index.
                        temp = index;
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

        RemoveDuplicate sList = new RemoveDuplicate();

        //Adds data to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(2);
        sList.addNode(2);
        sList.addNode(4);
        sList.addNode(1);

        System.out.println("Originals list: ");
        sList.display();

        //Removes duplicate nodes
        sList.removeDuplicate();

        System.out.println("List after removing duplicates: ");
        sList.display();
    }
*/
}
