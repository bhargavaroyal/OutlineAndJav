package com.bhargavaroyal.javalib.programs.TreeProgram;
/*The width of the binary tree is the number of nodes present in any level. So, the level which has the maximum number of nodes will be the maximum width of the binary tree. To solve this problem, traverse the tree level-wise and count the nodes in each level.

In the given binary tree,
Level 1 has one node, so maxWidth = 1.
Level 2 has two nodes, so maxWidth = 2 as (2 > 1).
Level 3 has four nodes, so maxWidth = 4 as (4 > 2).
Level 4 has one node, so maxWidth = 4 as (1 < 4).
So, the maximum width of the above binary tree is 4 denoted by white ellipse.
Algorithm
1.	Define Node class which has three attributes namely: data left and right. Here, left represents the left child of the node and right represents the right child of the node.
2.	When a node is created, data will pass to data attribute of the node and both left and right will be set to null.
3.	Define another class which has an attribute root.
1.	Root represents the root node of the tree and initializes it to null.
4.	findMaximumWidth() will find out the maximum width of the given binary tree:
1.	Variable maxWidth will store the maximum number of nodes present in any level.
2.	The queue is used for traversing binary tree level-wise.
3.	It checks whether the root is null, which means the tree is empty.
4.	If not, add the root node to queue. Variable nodesInLevel keeps track of the number of nodes in each level.
5.	If nodesInLevel > 0, remove the node from the front of the queue and add its left and right child to the queue. For the first iteration, node 1 will be removed and its children nodes 2 and 3 will be added to the queue. In the second iteration, node 2 will be removed, its children 4 and 5 will be added to the queue and so on.
6.	MaxWidth will store max(maxWidth, nodesInLevel). So, at any given point of time, it will represent the maximum number of nodes.
7.	This will continue till all the levels of the tree is traversed.
*/
public class BinaryTreeWidth {
/*      //Represent the node of binary tree
      public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
          //Assign data to the new node, set left and right children to null
          this.data = data;
          this.left = null;
          this.right = null;
        }
      }

      //Represent the root of binary tree
      public Node root;

      public BinaryTree(){
        root = null;
      }

      //findMaximumWidth() will find out the maximum width of the given binary tree
      public int findMaximumWidth() {
          int maxWidth = 0;

          //Variable nodesInLevel keep tracks of number of nodes in each level
          int nodesInLevel = 0;
          //queue will be used to keep track of nodes of tree level-wise
          Queue<Node> queue = new LinkedList<Node>();

          //Check if root is null, then width will be 0
          if(root == null) {
              System.out.println("Tree is empty");
              return 0;
          }
          else {
              //Add root node to queue as it represents the first level
              queue.add(root);

              while(queue.size() != 0) {

                  //Variable nodesInLevel will hold the size of queue i.e. number of elements in queue
                  nodesInLevel = queue.size();
                  //maxWidth will hold maximum width.
                  //If nodesInLevel is greater than maxWidth then, maxWidth will hold the value of nodesInLevel
                  maxWidth = Math.max(maxWidth, nodesInLevel);

                  //If variable nodesInLevel contains more than one node
                  //then, for each node, we'll add left and right child of the node to the queue
                  while(nodesInLevel > 0) {
                     Node current = queue.remove();
                     if(current.left != null)
                         queue.add(current.left);
                     if(current.right != null)
                         queue.add(current.right);
                     nodesInLevel--;
                  }
              }
          }
          return maxWidth;
      }

      public static void main(String[] args) {

          BinaryTree bt = new BinaryTree();
          //Add nodes to the binary tree
          bt.root = new Node(1);
          bt.root.left = new Node(2);
          bt.root.right = new Node(3);
          bt.root.left.left = new Node(4);
          bt.root.left.right = new Node(5);
          bt.root.right.left = new Node(6);
          bt.root.right.right = new Node(7);
          bt.root.left.left.left = new Node(8);

          //Display the maximum width of given tree
          System.out.println("Maximum width of the binary tree: " + bt.findMaximumWidth());
      }
*/
}
