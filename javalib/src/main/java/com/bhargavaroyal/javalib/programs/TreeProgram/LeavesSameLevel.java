package com.bhargavaroyal.javalib.programs.TreeProgram;
/*A Node is said to be leaf if it doesn't have any child node. In the below diagram, nodes 4, 5 and 6 are leaf nodes as they don't have any child node. Nodes 4, 5 and 6 are present at the same level, i.e., Level 2.

Algorithm
1.	Define Node class which has three attributes namely: data left and right. Here, left represents the left child of the node and right represents the right child of the node.
2.	When a node is created, data will pass to data attribute of the node and both left and right will be set to null.
3.	Define another class which has two attribute root and level.
1.	Root represents the root node of the tree and initializes it to null.
2.	The level will be used to store the level of the first encountered leaf node.
4.	isSameLevel() will check whether all leaves of given binary tree are at same level or not:
1.	It checks whether the root is null, which means the tree is empty.
2.	If the tree is not empty, traverse through the tree and check for leaf node whose left and right children are null.
3.	CurrentLevel will keep track of current level being traversed.
4.	When the first leaf node is encountered, store the value of currentLevel in variable level.
5.	Traverse recursively through all level, check for subsequent leaf nodes. If currentLevel of all leaf is equal to the value stored in level then, all leaves are at same level.
*/
public class LeavesSameLevel {
/*//Represent a node of binary tree
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

    //It will store level of first encountered leaf
    public static int level = 0;

    public LeafLevel(){
        root = null;
    }

    //isSameLevel() will check whether all leaves of the binary tree is at same level or not
    public boolean isSameLevel(Node temp, int currentLevel ) {

        //Check whether tree is empty
        if(root == null){
          System.out.println("Tree is empty");
          return true;
        }
        else {
            //Checks whether node is null
            if(temp==null)
                return true;

            if(temp.left == null && temp.right == null) {
                //If first leaf is encountered, set level to current level
                if(level == 0) {
                    level = currentLevel ;
                    return true;
                }
                //Checks whether the other leaves are at same level of that of first leaf
                else
                   return (level == currentLevel) ;
             }

            //Checks for leaf node in left and right subtree recursively.
            return  (isSameLevel(temp.left, currentLevel + 1) && isSameLevel(temp.right, currentLevel + 1)) ;
         }
    }

    public static void main (String[] args) {

        LeafLevel bt = new LeafLevel();
        //Add nodes to the binary tree
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);

        //Checks whether all leaves of given binary tree is at same level
        if(bt.isSameLevel(bt.root, 1))
            System.out.println("All leaves are at same level");
        else
            System.out.println("All leaves are not at same level");
  }
*/
}
