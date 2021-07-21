package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Input:
#Add nodes to the list
sList.addNode(1);
sList.addNode(2);
sList.addNode(3);
sList.addNode(2);
sList.addNode(1);
Output:
Nodes of the singly linked list: 1 2 3 2 1
Given singly linked list is a palindrome
*/
/*. To check whether a list is a palindrome, we traverse the list and check if any element from the starting half doesn't match with any element from the ending half, then we set the variable flag to false and break the loop.
In the last, if the flag is false, then the list is palindrome otherwise not. The algorithm to check whether a list is a palindrome or not is given below.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class Palindrome which has three attributes: head, tail, and size.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to a newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to a newly added node. This new node will become the new tail of the list.
4.	reverseList() will reverse the order of the node present in the list:
1.	Node current will represent a node from which a list needs to be reversed.
2.	Node prevNode represent the previous node to current and nextNode represent the node next to current.
3.	The list will be reversed by swapping the prevNode with nextNode for each node.
5.	isPalindrome() will check whether given list is palindrome or not:
1.	Declare a node current which will initially point to head node.
2.	The variable flag will store a boolean value true.
3.	Calculate the mid-point of the list by dividing the size of the list by 2.
4.	Traverse through the list till current points to the middle node.
5.	Reverse the list after the middle node until the last node using reverseList(). This list will be the second half of the list.
6.	Now, compare nodes of first half and second half of the list.
7.	If any of the nodes don't match then, set a flag to false and break the loop.
8.	If the flag is true after the loop which denotes that list is a palindrome.
9.	If the flag is false, then the list is not a palindrome.
6.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class PalindromeLinkedList {
/*public class Palindrome {

    //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size;
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
        //Size will count the number of nodes present in the list
        size++;
    }

    //reverseList() will reverse the singly linked list and return the head of the list
    public Node reverseList(Node temp){
        Node current = temp;
        Node prevNode = null, nextNode = null;

       //Swap the previous and next nodes of each node to reverse the direction of the list
        while(current != null){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }

    //isPalindrome() will determine whether given list is palindrome or not.
    public void isPalindrome(){
        Node current = head;
        boolean flag = true;

        //Store the mid position of the list
        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);

        //Finds the middle node in given singly linked list
        for(int i=1; i<mid; i++){
            current = current.next;
        }

        //Reverse the list after middle node to end
        Node revHead = reverseList(current.next);

        //Compare nodes of first half and second half of list
        while(head != null && revHead != null){
            if(head.data != revHead.data){
                flag = false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }

        if(flag)
            System.out.println("Given singly linked list is a palindrome");
        else
            System.out.println("Given singly linked list is not a palindrome");
    }

    //display() will display all the nodes present in the list
        public void display() {
            //Node current will point to head
            Node current = head;

            if(head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of singly linked list: ");
            while(current != null) {
                //Prints each node by incrementing pointer
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
    }

    public static void main(String[] args) {

        Palindrome sList = new Palindrome();

        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(2);
        sList.addNode(1);

        sList.display();

        //Checks whether given list is palindrome or not
        sList.isPalindrome();
    }
}
*/

}
