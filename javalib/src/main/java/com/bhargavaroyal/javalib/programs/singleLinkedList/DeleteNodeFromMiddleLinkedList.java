package com.bhargavaroyal.javalib.programs.singleLinkedList;
/*Input:
#Add nodes to the list
sList.addNode(1);
sList.addNode(2);
sList.addNode(3);
sList.addNode(4);
Output:
Original List: 1 2 3 4
Updated List: 1 3 4
Updated List: 1 4
Updated List: 4
Updated List: List is empty
*/
/*To accomplish this task, we will calculate the size of the list and then divide it by 2 to get the mid-point of the list. Node temp will point to head node. We will iterate through the list till mid?point is reached. Now, the temp will point to middle node and node current will point to node previous to temp. We delete the middle node such that current's next node will point to temp's next node.

Consider the above example, mid-point of the above list is 2. Iterate temp from head to mid-point. Now, temp is pointing to mid node which needs to be deleted. In this case, Node is the middle node which needs to be deleted. The node can be deleted by making node 2's next (current) to point to node 3 (temp's next node). Set temp to null.
Algorithm
1.	Create a class Node which has two attributes: data and next. Next is a pointer to the next node in the list.
2.	Create another class DeleteMid which has three attributes: head, tail, and size which keep tracks of the number of nodes present in the list.
3.	addNode() will add a new node to the list:
1.	Create a new node.
2.	It first checks, whether the head is equal to null which means the list is empty.
3.	If the list is empty, both head and tail will point to the newly added node.
4.	If the list is not empty, the new node will be added to end of the list such that tail's next will point to the newly added node. This new node will become the new tail of the list.
4.	deleteFromMid() will delete a node from the middle of the list:
1.	It first checks whether the head is null (empty list) then, display the message "List is empty" and return.
2.	If the list is not empty, it will check whether the list has only one node.
3.	If the list has only one node, it will set both head and tail to null.
4.	If the list has more than one node then, calculate the size of the list and divide it by 2 to get the mid-point of the list.
5.	Declare a node temp which will point to head and node current will point to node previous to temp.
6.	Traverse through the list till temp points to a middle node. If current not point to null then, delete the middle node(temp) by making current's next to point to temp's next. Else, both head and tail will point to node next to temp and delete the middle node by setting the temp to null.
5.	display() will display the nodes present in the list:
1.	Define a node current which will initially point to the head of the list.
2.	Traverse through the list till current points to null.
3.	Display each node by making current to point to node next to it in each iteration.
*/
public class DeleteNodeFromMiddleLinkedList {
/*//Represent a node of the singly linked list
struct node{
    int data;
    struct node *next;
};

int size;
//Represent the head and tail of the singly linked list
struct node *head, *tail = NULL;

//addNode() will add a new node to the list
void addNode(int data) {
    //Create a new node
    struct node *newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->next = NULL;

    //Checks if the list is empty
    if(head == NULL) {
        //If list is empty, both head and tail will point to new node
        head = newNode;
        tail = newNode;
    }
    else {
        //newNode will be added after tail such that tail's next will point to newNode
        tail->next = newNode;
        //newNode will become new tail of the list
        tail = newNode;
    }
    //Size will count the number of nodes present in the list
    size++;
}

//deleteFromMid() will delete a node from the middle of the list
void deleteFromMid() {
    struct node *temp, *current;

    //Checks if list is empty
    if(head == NULL) {
        printf("List is empty \n");
        return;
    }
    else {
        //Store the mid position of the list
        int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);

        //Checks whether the head is equal to the tail or not, if yes then the list has only one node.
        if( head != tail ) {
            //Initially, temp will point to head
            temp = head;
            current = NULL;

            //Current will point to node previous to temp
            //If temp is pointing to node 2 then current will point to node 1.
            for(int i = 0; i < count-1; i++){
                current = temp;
                temp = temp->next;
            }
            if(current != NULL) {
                //temp is the middle that needs to be removed.
                //So, current node will point to node next to temp by skipping temp.
                current->next = temp->next;
                //Delete temp
                temp = NULL;
            }
            //If current points to NULL then, head and tail will point to node next to temp.
            else {
                head = tail = temp->next;
                //Delete temp
                temp = NULL;
            }
        }
        //If the list contains only one element
        //then it will remove it and both head and tail will point to NULL
        else {
            head = tail = NULL;
        }
    }
    size--;
}

//display() will display all the nodes present in the list
void display() {
    //Node current will point to head
    struct node *current = head;
    if(head == NULL) {
        printf("List is empty\n");
        return;
    }
    while(current != NULL) {
        //Prints each node by incrementing pointer
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

int main()
{
    //Adds data to the list
    addNode(1);
    addNode(2);
    addNode(3);
    addNode(4);

    //Printing original list
    printf("Original List: \n");
    display();

    while(head != NULL) {
        deleteFromMid();
        //Printing updated list
        printf("Updated List: \n");
        display();
    }

    return 0;
    }
*/
}
