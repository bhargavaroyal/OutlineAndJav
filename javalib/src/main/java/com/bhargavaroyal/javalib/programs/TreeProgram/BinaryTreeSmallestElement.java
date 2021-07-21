package com.bhargavaroyal.javalib.programs.TreeProgram;
/*. We first define variable min that will hold root's data. Then, we traverse through left sub-tree to find the smallest node in left subtree. Compare it with min and store minimum of two in variable min. Then, we traverse through right subtree to find smallest node and compare it with min. At the end, min will have the smallest node.

Above diagram represents a binary tree. Initially, min will hold 4. Recursive through left subtree.
1.	min = 4, leftMin = 2    =>  (2 < 4) then min = 2
2.	min = 2, leftMin = 1    =>  (1 < 2) then min = 1
Recursive through right subtree.
1.	min = 1, rightMin = 3  =>  (1 < 3) then min = 1
2.	Recurse in left subtree of 5
3.	min = 1, leftMin = 5    =>  (1 < 5) then min = 1
Recurse in right subtree of 3
1.	min = 1, rightMin = 6  =>  (1 < 6) then min = 1
So, smallest node in above binary tree is 1.
Algorithm
1.	Define Node class which has three attributes namely: data, left and right. Here, left represents the left child of the node and right represents the right child of the node.
2.	When a node is created, data will pass to data attribute of node and both left and right will be set to null.
3.	Define another class which has an attribute root.
1.	Root represent root node of the tree and initialize it to null.
1.	smallestElement() will find out the smallest node in binary tree:
1.	It checks whether root is null, which means tree is empty.
2.	If tree is not empty, define a variable min that will store temp's data.
3.	Find out the minimum node in left subtree by calling smallestElement() recursively. Store that value in leftMin. Compare the value of min with leftMin and store the minimum of two to min.
4.	Find out the minimum node in right subtree by calling smallestElement() recursively. Store that value in rightMin. Compare the value of min with rightMin and store the maximum of two to min.
5.	At the end, min will hold the smallest node in the binary tree.
*/
public class BinaryTreeSmallestElement {
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

      public SmallestNode(){
          root = null;
      }

      //smallestElement() will find out the smallest node in the binary tree
      public int smallestElement(Node temp){
          //Check whether tree is empty
          if(root == null) {
              System.out.println("Tree is empty");
              return 0;
          }
          else {
                int leftMin, rightMin;
                //Min will store temp's data
                int min = temp.data;

                //It will find smallest element in left subtree
                if(temp.left != null){
                  leftMin = smallestElement(temp.left);
                  //If min is greater than leftMin then store the value of leftMin into min
                  min = Math.min(min, leftMin);
                }

                //It will find smallest element in right subtree
                if(temp.right != null){
                  rightMin = smallestElement(temp.right);
                  //If min is greater than rightMin then store the value of rightMin into min
                  min = Math.min(min, rightMin);
                }
                return min;
          }
      }

      public static void main(String[] args) {

        SmallestNode bt = new SmallestNode();
        //Add nodes to the binary tree
        bt.root = new Node(4);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(1);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);

        //Display smallest node in the binary tree
        System.out.println("Smallest element in the binary tree: " + bt.smallestElement(bt.root));
      }
*/
}
