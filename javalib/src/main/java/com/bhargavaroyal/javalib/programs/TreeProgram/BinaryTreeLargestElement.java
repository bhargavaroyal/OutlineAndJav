package com.bhargavaroyal.javalib.programs.TreeProgram;
/*We first define variable max that will hold root's data. Then, we traverse through the left sub-tree to find the largest node. Compare it with max and store the maximum of two in a variable max. Then, we traverse through the right subtree to find the largest node and compare it with max. In the end, max will have the largest node.

Above diagram represents a binary tree. Initially, max will hold 15. Recursive through left subtree.
1.	max = 15, leftMax = 20 => (20 > 15) then max = 20
2.	max = 20, leftMax = 74 => (74 > 20) then max = 74
Recursive through right subtree.
1.	max = 74, rightMax = 35 => (74 > 35) then max = 74
Recurse in the left subtree of 35
1.	max = 74, leftMax = 55 => (74 > 55) then max = 74
Recurse in the right subtree of 35
1.	max = 74, rightMax = 6 => (74 > 6) then max = 74
So, the largest node in above binary tree is 74.
Algorithm
1.	Define the class Node which has three attributes namely: data, left, and right. Here, left represents the left child of the node and right represents the right child of the node.
2.	Assign the data part of the node with an appropriate value and assign left and right to null.
3.	Define another class which has an attribute root.
1.	Root represents the root node of the tree which is initialized to null.
2.	largestElement() will find out the largest node in the binary tree:
1.	It checks whether the root is null, which means the tree is empty.
2.	If the tree is not empty, define a variable max that will store temp's data.
3.	Find out the maximum node in the left subtree by calling largestElement() recursively. Store that value in leftMax. Compare the value of max with leftMax and store the maximum of two to max.
4.	Find out the maximum node in right subtree by calling largestElement() recursively. Store that value in rightMax. Compare the value of max with rightMax and store the maximum of two to max.
5.	In the end, max will hold the largest node in the binary tree.
*/
public class BinaryTreeLargestElement {
/*//Represent the node of binary tree
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

      public LargestNode(){
        root = null;
      }

      //largestElement() will find out the largest node in the binary tree
      public int largestElement(Node temp){
          //Check whether tree is empty
           if(root == null) {
               System.out.println("Tree is empty");
               return 0;
            }
           else{
               int leftMax, rightMax;
               //Max will store temp's data
               int max = temp.data;

               //It will find largest element in left subtree
               if(temp.left != null){
                   leftMax = largestElement(temp.left);
                   //Compare max with leftMax and store greater value into max
                   max = Math.max(max, leftMax);
                }

                //It will find largest element in right subtree
                if(temp.right != null){
                    rightMax = largestElement(temp.right);
                    //Compare max with rightMax and store greater value into max
                    max = Math.max(max, rightMax);
                }
                return max;
           }
      }

      public static void main(String[] args) {

        LargestNode bt = new LargestNode();
        //Add nodes to the binary tree
        bt.root = new Node(15);
        bt.root.left = new Node(20);
        bt.root.right = new Node(35);
        bt.root.left.left = new Node(74);
        bt.root.right.left = new Node(55);
        bt.root.right.right = new Node(6);

        //Display largest node in the binary tree
        System.out.println("Largest element in the binary tree: " + bt.largestElement(bt.root));
      }
*/
}
