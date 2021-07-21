package com.bhargavaroyal.javalib.programs.singleLinkedList;

/*Input:
#Add nodes to the list
sList.addNode(1);
sList.addNode(2);
sList.addNode(3);
sList.addNode(4);
#Search for node 2 in the list
sList.searchNode(2);
#Search for the nodein the list
sList.searchNode(7);
Output:
Element is present in the list at the position : 2
Element is not present in the list
To solve this problem, we will traverse through the list using a node current. Current points to head and start comparing searched node data with current node data. If they are equal, set the flag to true and print the message along with the position of the searched node.
For, eg. In the above list, a search node says 4 which can be found at the position 4.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class SearchLinkedList which has two attributes: head and tail.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	searchNode() will search for a node in the list:
1.	Variable i will keep track of the position of the searched node.
2.	The variable flag will store boolean value false.
3.	Node current will point to head node.
4.	Iterate through the loop by incrementing current to current.next and i to i + 1.
5.	Compare each node's data with the searched node. If a match is found, set flag to true.
6.	If the flag is true, display the position of the searched node.
7.	Else, display the message "Element is not present in the list".
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.

*/
public class SearchElementLinkedList {
/*//Represent a node of singly linked list
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

    //searchNode() will search for a given node in the list
    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;

        //Checks whether list is empty
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                 //Compares node to be found with each node present in the list
                if(current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
             System.out.println("Element is present in the list at the position : " + i);
        else
             System.out.println("Element is not present in the list");
    }

    public static void main(String[] args) {

        SearchLinkedList sList = new SearchLinkedList();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        //Search for node 2 in the list
        sList.searchNode(2);
        //Search for a node  in the list
        sList.searchNode(7);
    }
*/
}
