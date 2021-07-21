package com.bhargavaroyal.javalib.programs.singleLinkedList;

/*One of the approaches to solving this problem is to reach the end the of the list and display the nodes from tail to head recursively.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to the newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to the newly added node. This new node will become the new tail of the list.
4.	reverse() will reverse the order of the nodes present in the list.
1.	This method checks whether node next to current is null which implies that, current is pointing to tail, then it will print the data of the tail node.
2.	Recursively call reverse() by considering node next to current node and prints out all the nodes in reverse order starting from the tail.
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class CreateLinkedListDisplayReverseOrder {
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

    //reverse() will help the reverse the order of the list
    public void reverse(Node current) {
        //Checks if list is empty
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            //Checks if the next node is null, if yes then prints it.
            if(current.next == null) {
                System.out.print(current.data + " ");
                return;
            }
            //Recursively calls the reverse function
            reverse(current.next);
            System.out.print(current.data + " ");
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

        ReverseList sList = new ReverseList();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        System.out.println("Original List: ");
        sList.display();

        System.out.println("Reversed List: ");
        //Print reversed list
        sList.reverse(sList.head);
    }
*/

}
