package com.bhargavaroyal.javalib.programs.circularLinkedList;
/*Input:
#Adds data to the list
cl.add(1);
cl.add(2);
cl.add(3);
cl.add(4);
#Inserting node '5' in the middle
cl.addInMid(5);
#Inserting node '6' in the middle
cl.addInMid(6);
Output:
Original list: 1 2 3 4
Updated List: 1 2 5 3 4
Updated List: 1 2 5 6 3 4

In this program, we create a circular linked list and insert a new node in the middle of the list. If the list is empty, both head and tail will point to new node. If the list is not empty, then we will calculate the size of the list and divide it by 2 to get the mid-point of the list where the new node needs to be inserted.

After inserting the new node in the middle of the list.

Consider the above diagram; the new node needs to be added to the middle of the list. First, we calculate the size which in this case is 4. So, to get the mid-point, we divide it by 2 and store it in a variable count. We will define two nodes current, and temp such that temp will point to head, and current will point to the node previous to temp. We iterate through the list till mid-point is reached by incrementing temp to temp.next then, insert the new node in between current and temp. Current'next node will be new and the new's next node will be temp.
Algorithm
1.	Define a Node class which represents a node in the list. It has two properties data and next which will point to the next node.
2.	Define another class for creating the circular linked list and it has two nodes: head and tail. Variable size stores the size of the list. It has two methods: addInMid() and display() .
3.	addInMid() will add the node to the middle of the list:
1.	It first checks whether the head is null (empty list), then it will insert the node as the head.
2.	Both head and tail will point to the newly added node.
3.	If the list is not empty, then we calculate size and divide it by 2 to get the mid-point.
4.	Define node temp that will point to head and current will point to a node previous to temp.
5.	Iterate through the list until the middle of the list is reached by incrementing temp to temp.next.
6.	The new node will be inserted after current and before temp such that current will point to the new node and the new node will point to temp.
4.	display() will show all the nodes present in the list.
1.	Define a new node 'current' that will point to the head.
2.	Print current.data till current will points to head again.
3.	Current will point to the next node in the list in each iteration.
*/
public class InsertNodeMiddleCLL {
/*    //Represents the node of list.
        public class Node{
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
            }
        }

        public int size;
        //Declaring head and tail pointer as null.
        public Node head = null;
        public Node tail = null;

        //This function will add the new node to the list.
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
            //Size will count the number of element in the list
            size++;
        }

        //This function will add the new node at the middle of the list.
        public void addInMid(int data){
            Node newNode = new Node(data);
            //Checks if the list is empty.
            if(head == null){
                //If list is empty, both head and tail would point to new node.
                head = newNode;
                tail = newNode;
                newNode.next = head;
            }
            else{
                Node temp,current;
                //Store the mid-point of the list
                int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);
                //temp will point to head
                temp = head;
                current= null;
                for(int i = 0; i < count; i++){
                    //Current will point to node previous to temp.
                    current = temp;
                    //Traverse through the list till the middle of the list is reached
                    temp = temp.next;
                }

                //current will point to new node
                current.next = newNode;
                //new node will point to temp
                newNode.next = temp;
            }
            size++;
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
            InsertInMid cl = new InsertInMid();
            //Adds data to the list
            cl.add(1);
            cl.add(2);
            cl.add(3);
            cl.add(4);

            System.out.println("Original list: ");
            cl.display();

            //Inserting node '5' in the middle
            cl.addInMid(5);
            System.out.println( "Updated List: ");
            cl.display();

            //Inserting node '6' in the middle
            cl.addInMid(6);
            System.out.println("Updated List: ");
            cl.display();
        }
*/
}
