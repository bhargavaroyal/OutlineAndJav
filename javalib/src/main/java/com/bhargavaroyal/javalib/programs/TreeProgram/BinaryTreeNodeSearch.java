package com.bhargavaroyal.javalib.programs.TreeProgram;
/*The tree is a collection of elements called nodes. Nodes are connected through edges and contain data. The first node of the tree is called Root. Each node may or may not have children node. The node which doesn't have any child node is called leaf.
The binary tree is another kind of tree data structure in which each node can have at most two children. That is, each node in the binary tree will have data, left child and right child.

Above diagram represents a binary tree in which 1 represent the root node of the tree. Node 2 has 4 as its left child and Node 3 has 5 as its left child and 6 as its right child. Nodes 4,5 and 6 are leaf nodes as they don?t have any child node.
Explanation
In this program, we will search a particular value in the binary tree. If it is present, print the message "Element is present in the binary tree" else print the message "Element is not present in the binary tree". In a nutshell, we will first compare data of root with data of node to be searched. If the match is found, set the flag to true. Else, search the node in left subtree and then in the right subtree.
Algorithm
1.	Define Node class which has three attributes namely: data left and right. Here, left represents the left child of the node and right represents the right child of the node.
2.	When a node is created, data will pass to data attribute of the node and both left and right will be set to null.
3.	Define another class which has two attribute root and flag.
1.	Root represents the root node of the tree and initializes it to null.
2.	The Flag will be used to check whether the given node is present in the tree or not. Initially, it will be set to false.
4.	searchNode() will search for a particular node in the binary tree:
1.	It checks whether the root is null, which means the tree is empty.
2.	If the tree is not empty, it will compare temp?s data with value. If they are equal, it will set the flag to true and return.
3.	Traverse left subtree by calling searchNode() recursively and check whether the value is present in left subtree.
4.	Traverse right subtree by calling searchNode() recursively and check whether the value is present in the right subtree.
*/
public class BinaryTreeNodeSearch {
/*      //Represent a node of binary tree
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

      public static boolean flag = false;

      public SearchBinaryTree(){
        root = null;
      }

      //searchNode() will search for the particular node in the binary tree
      public void searchNode(Node temp, int value){
        //Check whether tree is empty
        if(root == null){
          System.out.println("Tree is empty");
        }
        else{
          //If value is found in the given binary tree then, set the flag to true
          if(temp.data == value){
            flag = true;
               return;
          }
          //Search in left subtree
          if(flag == false && temp.left != null){
             searchNode(temp.left, value);
          }
          //Search in right subtree
          if(flag == false && temp.right != null){
             searchNode(temp.right, value);
          }
        }
      }

      public static void main(String[] args) {

        SearchBinaryTree bt = new SearchBinaryTree();
        //Add nodes to the binary tree
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);

        //Search for node 5 in the binary tree
           bt.searchNode(bt.root, 5);

        if(flag)
          System.out.println("Element is present in the binary tree");
        else
          System.out.println("Element is not present in the binary tree");
      }
*/
}
