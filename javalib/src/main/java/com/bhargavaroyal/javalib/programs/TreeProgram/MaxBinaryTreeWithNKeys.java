package com.bhargavaroyal.javalib.programs.TreeProgram;

/*trees. When we choose node 1 as the root node, we get two trees. Similarly, one tree with 2 as root node and two trees when we select 3 as the root node.
This approach involves selecting a node recursively as the root node and create possible binary search tree.
An easy way to calculate the total number of possible binary search trees are through Catalan number:
1.	Cn = (2n)! / n! *(n+1)!

Algorithm
1.	Define Node class which has three attributes namely: data left and right. Here, left represents the left child of the node and right represents the right child of the node.
2.	When a node is created, data will be passed to the data attribute of the node and both left and right will be set to null.
3.	Define another class which has an attribute root.
1.	Root represents the root node of the tree and initialize it to null.
4.	numOfBST() will find out total possible binary search tree for given key:
1.	It will calculate the Catalan number for given key by making a call to factorial().
2.	Catalan number can be calculated using the formula:
Cn = (2n)! / n! *(n+1)!
3.	Factorial() will calculate factorial of a given number.
*/

public class MaxBinaryTreeWithNKeys {
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

    public BinarySearchTree(){
        root = null;
    }

    //factorial() will calculate the factorial of given number
    public int factorial(int num) {
        int fact = 1;
        if(num == 0)
            return 1;
        else {
            while(num > 1) {
                fact = fact * num;
                num--;
            }
            return fact;
        }
    }

    //numOfBST() will calculate the total number of possible BST by calculating Catalan Number for given key
    public int numOfBST(int key) {
        int catalanNumber = factorial(2 * key)/(factorial(key + 1) * factorial(key));
        return catalanNumber;
    }

    public static void main(String[] args) {

        BinarySearchTree bt = new BinarySearchTree();

        //Display total number of possible binary search tree with key 5
        System.out.println("Total number of possible Binary Search Trees with given key: " + bt.numOfBST(5));
      }

*/
}
