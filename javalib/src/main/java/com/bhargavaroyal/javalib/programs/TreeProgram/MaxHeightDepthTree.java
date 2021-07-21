package com.bhargavaroyal.javalib.programs.TreeProgram;
/*The height of the binary tree can be defined as the number of nodes between root and a leaf. Maximum height will be the number of levels between root and deepest leaf. To solve this problem, we traverse through the left subtree and calculate the height of the left subtree. Again, calculate the height of the right subtree by traversing through it. Maximum height will be maximum of the height of the left subtree and right subtree.

In the above binary tree,
Height of left subtree is 2.
Height of right subtree is 4.
MaxHeight = Max(leftHeight, rightHeight) + 1; Here, 1 Represents root node's height
The maximum height of the given binary tree is (4 + 1) = 5 denoted by white dotted line.
Algorithm
1.	Define Node class which has three attributes namely: data left and right. Here, left represents the left child of the node and right represents the right child of the node.
2.	When a node is created, data will pass to data attribute of the node and both left and right will be set to null.
3.	Define another class which has an attribute root.
1.	Root represents the root node of the tree and initializes it to null.
4.	findHeight() will determine the maximum height of the binary tree:
1.	It checks whether the root is null, which means the tree is empty.
2.	If the tree is not empty, traverse through left subtree to determine the height of the left subtree and store the value in leftHeight.
3.	Similarly, determine the height of the right subtree and store the value in rightHeight.
4.	Maximum will determine the maximum of leftHeight and rightHeight then, add 1 for root's height.
*/
public class MaxHeightDepthTree {
/*    //Represent the node of binary tree
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

    //findHeight() will determine the maximum height of the binary tree
    public int findHeight(Node temp){
        //Check whether tree is empty
        if(root == null) {
             System.out.println("Tree is empty");
            return 0;
        }
        else {
            int leftHeight = 0, rightHeight = 0;

            //Calculate the height of left subtree
            if(temp.left != null)
                leftHeight = findHeight(temp.left);

            //Calculate the height of right subtree
            if(temp.right != null)
                rightHeight = findHeight(temp.right);

            //Compare height of left subtree and right subtree
            //and store maximum of two in variable max
            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;

            //Calculate the total height of tree by adding height of root
            return (max + 1);
        }
     }

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        //Add nodes to the binary tree
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);
        bt.root.right.right.right= new Node(7);
        bt.root.right.right.right.right = new Node(8);

        //Display the maximum height of the given binary tree
        System.out.println("Maximum height of given binary tree: " + bt.findHeight(bt.root));
  }
*/
}
