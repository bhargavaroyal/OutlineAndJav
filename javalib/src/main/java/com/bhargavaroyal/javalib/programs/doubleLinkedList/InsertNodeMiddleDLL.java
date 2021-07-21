package com.bhargavaroyal.javalib.programs.doubleLinkedList;
/*Input:
#Add nodes to the list
dList.addNode(1);
dList.addNode(2);
#Adding node '3' in the middle
dList.addInMid(3);
#Adding node '4' in the middle
dList.addInMid(4);
#Adding node '5' in the middle
dList.addInMid(5);
Output:
Original list: 1 2
Updated List: 1 3 2
Updated List: 1 3 4 2
Updated List: 1 3 5 4 2
In this program, we create a doubly linked list and insert a new node in the middle of list. If list is empty, both head and tail will point to new node. If list is not empty, then we will calculate the size of the list and divide it by 2 to get the mid-point of the list where new node needs to be inserted.

Consider the above diagram; a new node needs to be added to the middle of the list. First, we calculate the size which in this case is 4. So, to get the mid-point, we divide it by 2 and store it in a variable mid. Node current will point to head. First, we iterate through the list until current points to mid position. Define another node temp which point to node next to current. Insert the new node between current and temp
Algorithm
1.	Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
2.	Define another class for creating the doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
3.	addNode() will add node to the list:
1.	It first checks whether the head is null, then it will insert the node as the head.
2.	Both head and tail will point to a newly added node.
3.	Head's previous pointer will point to null and tail's next pointer will point to null.
4.	If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
5.	The new node will become the new tail. Tail's next pointer will point to null.
4.	addInMid() will add a node to the middle of the list:
1.	It first checks whether the head is null (empty list), then it will insert the node as the head.
2.	Both head and tail will point to a newly added node.
3.	If the list is not empty, then we calculate size and divide it by 2 to get the mid-point.
4.	Define node current that will point to head and iterate through the list till current will point to mid node.
5.	Define another node temp which will point to node next to current.
6.	The new node will be inserted after current and before temp such that current will point to the new node and the new node will point to temp.
5.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current points to null.
3.	Current will point to the next node in the list in each iteration.
*/
public class InsertNodeMiddleDLL {
    /*    //Represent a node of the doubly linked list

    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public int size = 0;
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
        //Size will count the number of nodes present in the list
        size++;
    }

    //addInMid() will add a node to the middle of the list
    public void addInMid(int data) {
       //Create a new node
        Node newNode = new Node(data);

        //If list is empty
        if(head == null) {
            //Both head and tail will point to newNode
            head = tail = newNode;
            //head's previous will point to null
            head.previous = null;
            //tail's next point to null, as it is the last node of the list
            tail.next = null;
        }
        else {
            //current will point to head
            Node current = head, temp = null;

            //Store the mid position of the list
            int mid = (size % 2 == 0) ? (size/2) : ((size+1)/2);

            //Iterate through list till current points to mid position
            for(int i = 1; i < mid; i++){
                current = current.next;
            }

            //Node temp will point to node next to current
            temp = current.next;
            temp.previous = current;

            //newNode will be added between current and temp
            current.next = newNode;
            newNode.previous = current;
            newNode.next = temp;
            temp.previous = newNode;
        }
        size++;
    }

    //display() will print out the nodes of the list
    public void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            //Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertMid dList = new InsertMid();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);

        System.out.println("Original list: ");
        dList.display();

        //Adding node '3' in the middle
        dList.addInMid(3);
        System.out.println( "Updated List: ");
        dList.display();

        //Adding node '4' in the middle
        dList.addInMid(4);
        System.out.println("Updated List: ");
        dList.display();

        //Adding node '5' in the middle
        dList.addInMid(5);
        System.out.println("Updated List: ");
        dList.display();
    }
*/
}
