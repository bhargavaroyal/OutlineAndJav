package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(70);
cl.add(90);
cl.add(20);
cl.add(100);
cl.add(50);
Output:
Original list:70 90 20 100 50
Sorted list:20 50 70 90 100

In this program, we will create a circular linked list and sort the list in ascending order. In this example, we maintain two nodes: current which will point to head and index which will point to next node to current. The first loop, keep track of current and second loop will keep track of index. In the first iteration, current will point to 9. The index will point to node next to current which in this case is 5. 9 is compared with 5, since 9 > 5, swap data of index node with the current node. Now, the current will have 5. Now, 5 will be compared to 2. Again 5 > 2, swap the data. Now current will hold 2 and index will hold 7. 2 < 7, nothing will be done. The index will be incremented and pointed to 3. 2 < 3. Nothing will be done. In this way, we will have a minimum value node in the first position. Then, we will keep on finding minimum element in the rest of the list until the list is completely sorted.
9->5->2->7->3
2->9->5->7->3
2->3->9->7->5
2->3->5->9->7
2->3->5->7->9
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating a circular linked list, and it has two nodes: head and tail.
3.	sortList() will sort the list:
1.	We will maintain two nodes current which points to head, and index will point to node next to current.
2.	Traverse through the list starting from index till the end is reached.
3.	If current.data is greater than the index.data, swap the data between them.
4.	At the first iteration, we will get minimum element at the start of the list.
5.	Then current will point to current.next.
6.	Repeat steps b to e till we get next minimum node.
7.	At the end of both the loop, the list will be sorted.
*/
public class SortElementsCLL {
/*//Represents the node of list.
public class Node{
int data;
Node next;
public Node(int data) {
this.data = data;
}
}
//Declaring head and tail pointer as null.
public Node head = null;
public Node tail = null;
//This function will add the new node at the end of the list.
public void add(int data){
//Create new node
Node newNode = new Node(data);
//Checks if the list is empty.
if(head == null) {
 //If list is empty, both head and tail would point to new node.
head = newNode;
tail = newNode;
newNode.next = head;
}
else {
//tail will point to new node.
tail.next = newNode;
//New node will become new tail.
tail = newNode;
//Since, it is circular linked list tail will points to head.
tail.next = head;
}
}
//This function sorts the list in ascending order
public void sortList() {
//Current will point to head
Node current = head, index = null;
int temp;
if(head == null) {
System.out.println("List is empty");
}
else {
do{
//Index will point to node next to current
index = current.next;
while(index != head) {
//If current node is greater than index data, swaps the data
if(current.data > index.data) {
temp =current.data;
current.data= index.data;
index.data = temp;
}
index= index.next;
}
current =current.next;
}while(current.next != head);
}
}
//Displays all the nodes in the list
public void display() {
Node current = head;
if(head == null) {
System.out.println("List is empty");
}
else {
 do{
//Prints each node by incrementing pointer.
System.out.print(" "+ current.data);
current = current.next;
}while(current != head);
System.out.println();
}
}
public static void main(String[] args) {
SortList cl = new SortList();
//Adds data to the list
cl.add(70);
cl.add(90);
cl.add(20);
cl.add(100);
cl.add(50);
//Displaying original list
System.out.println("Original list: ");
cl.display();
//Sorting list
cl.sortList();
//Displaying sorted list
System.out.println("Sorted list: ");
cl.display();
}
*/

}
