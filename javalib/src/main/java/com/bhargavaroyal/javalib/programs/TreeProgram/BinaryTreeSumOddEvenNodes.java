package com.bhargavaroyal.javalib.programs.TreeProgram;
/*1.	OddLevelSum = 1 + 4 + 5 + 6 = 16
2.	EvenLevelSum = 2 + 3 = 5
3.	Difference = |16 - 5| = 11
Algorithm
1.	Define Node class which has three attributes namely: data, left, and right. Here, left represents the left child of the node and right represents the right child of the node.
2.	When a node is created, Assign the data part of a node with an appropriate value having its left and right child as NULL.
3.	Define another class which has an attribute root.
1.	Root represents the root node of the tree having null value initially.
4.	The difference() will calculate the difference between the sum of nodes at the odd and even levels:
1.	Traverse through the binary tree level wise using Queues.
2.	Keep track of current level using the variable currentLevel.
3.	If the currentLevel is divisible by 2, then add all the values of nodes present in currentLevel to variable evenLevel. Else, add all the values of nodes to variable oddLevel.
4.	Calculate the difference by subtracting value present in evenLevel from oddLevel.
*/
public class BinaryTreeSumOddEvenNodes {
/*
    //Represent a node of binary tree
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

    public DiffOddEven(){
        root = null;
    }

    //difference() will calculate the difference between sum of odd and even levels of binary tree
    public int difference() {
          int oddLevel = 0, evenLevel = 0, diffOddEven = 0;

          //Variable nodesInLevel keep tracks of number of nodes in each level
          int nodesInLevel = 0;

          //Variable currentLevel keep track of level in binary tree
          int currentLevel = 0;

          //Queue will be used to keep track of nodes of tree level-wise
          Queue<Node> queue = new LinkedList<Node>();

          //Check if root is null
          if(root == null) {
              System.out.println("Tree is empty");
              return 0;
          }
          else {
              //Add root node to queue as it represents the first level
              queue.add(root);
              currentLevel++;

              while(queue.size() != 0) {

                  //Variable nodesInLevel will hold the size of queue i.e. number of elements in queue
                  nodesInLevel = queue.size();

                  while(nodesInLevel > 0) {
                      Node current = queue.remove();

                    //Checks if currentLevel is even or not.
                      if(currentLevel % 2 == 0)
                          //If level is even, add nodes's to variable evenLevel
                          evenLevel += current.data;
                      else
                          //If level is odd, add nodes's to variable oddLevel
                          oddLevel += current.data;

                      //Adds left child to queue
                      if(current.left != null)
                          queue.add(current.left);
                      //Adds right child to queue
                      if(current.right != null)
                          queue.add(current.right);
                     nodesInLevel--;
                  }
                  currentLevel++;
              }
              //Calculates difference between oddLevel and evenLevel
              diffOddEven = Math.abs(oddLevel - evenLevel);
          }
          return diffOddEven;
      }

    public static void main (String[] args) {

        DiffOddEven bt = new DiffOddEven();
        //Add nodes to the binary tree
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);

        //Display the difference between sum of odd level and even level nodes
        System.out.println("Difference between sum of odd level and even level nodes: " + bt.difference());
}
*/

}
