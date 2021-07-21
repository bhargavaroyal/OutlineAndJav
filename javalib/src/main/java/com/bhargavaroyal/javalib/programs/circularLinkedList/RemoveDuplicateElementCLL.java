package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(1);
cl.add(2);
cl.add(3);
cl.add(2);
cl.add(2);
cl.add(4);
Output:
Originals list:1 2 3 2 2 4
List after removing duplicates:1 2 3 4

In this program, we will create a circular linked list and remove duplicate nodes from the list. We will compare a node with rest of the list and check for the duplicate. If the duplicate is found, delete the duplicate node from the list.
1->2->2->4->3
In the above list, we can see, node 2 is present twice in the list. So, we will have a node current that will iterate through the list. The index will point to next node to current. Temp will be pointing to the node previous to index. When a duplicate is found, we delete it by pointing temp.next to index.next. Above list after removing duplicates:
1->2->4->3
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail.
3.	removeDuplicate() will remove duplicate nodes from the list:
1.	Node current will point to head and used to traverse through the list.
2.	The index will point to the next node to current and temp will point to previous node to index.
3.	We will compare the current.data with the index.data. If the match is found, delete duplicate data by pointing temp's next to index's next.
4.	Increment index to index.next and current to current .next.
5.	Repeat step from c to d till all the duplicates are removed.
*/
public class RemoveDuplicateElementCLL {
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
//Removes duplicate from the list
public void removeDuplicate() {
//Current will point to head
Node current = head, index = null, temp = null;
if(head == null) {
System.out.println("List is empty");
}
else {
do{
//Temp will point to previous node of index.
temp = current;
//Index will point to node next to current
index = current.next;
while(index != head) {
//If current node is equal to index data
if(current.data == index.data) {
//Here, index node is pointing to the node which is duplicate of current node
//Skips the duplicate node by pointing to next node
temp.next = index.next;
}
else {
//Temp will point to previous node of index.
temp = index;
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
RemoveDuplicate cl = new RemoveDuplicate();
//Adds data to the list
cl.add(1);
cl.add(2);
cl.add(3);
cl.add(2);
cl.add(2);
cl.add(4);
System.out.println("Originals list: ");
cl.display();
//Removes duplicate nodes
cl.removeDuplicate();
System.out.println("List after removing duplicates: ");
cl.display();
}
*/
}
