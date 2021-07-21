package com.bhargavaroyal.javalib.programs.TreeProgram;
/*The distance with the maximum value will be kept by using the variable MaxDistance. Initially, MaxDistance is initialized with the value of distance. If any value is found greater than MaxDistance, overwrite the value of MaxDistance.
Repeat this process until we find the maximum possible distance between two nodes of the tree. The algorithm of the process is given below.

Algorithm
1.	Define Node class which has three attributes namely: data left and right. Here, left represents the left child of the node and right represents the right child of the node.
2.	When a node is created, data will pass to data attribute of the node and both left and right will be set to null.
3.	Define another class which has two attribute root and treeArray.
1.	Root represents the root node of the tree and initializes it to null.
2.	treeArray will store the array representation of the binary tree.
4.	nodesAtMaxDistance() will find out the nodes which are present at the maximum distance:
1.	It will calculate the distance between all the nodes present in the binary tree and store it in the variable distance.
2.	MaxDistance keeps tracks of maximum possible distance between nodes. If maxDistance is less than distance, then the value of distance will be stored in maxDistance. Clears the array to get rid of previously stored values. Nodes which are at the maximum distance will be stored in an array arr.
3.	If more than one pair of nodes is at maxDistance then, store them in the array arr.
5.	calculateSize() will count the number of nodes present in the tree.
6.	convertBTtoArray() will convert the binary tree to its array representation by traversing the tree and adding elements to treeArray.
7.	getDistance() will calculate the distance of a given node from the root.
8.	LowestCommonAncestor() will find out the lowest common ancestor for the nodes n1 and n2.
1.	If any of the nodes is equal to the root node, then return root as the lowest common ancestor.
2.	Else, search nodes n1 and n2 in left subtree and right subtree.
3.	If a node is found such that n1 is the left child of that node and n2 is right child of that node or vice-versa. Returns that node as the lowest common ancestor.
9.	FindDistance() will calculate the distance between two nodes.
1.	First, it calculates the distance of each node from the root node.
2.	Subtract the 2 * distance of lowest common ancestor from this root node
*/
public class BinaryTreeNodesMaxDistance {
/*public class MaxDistance {

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

    int[] treeArray;
    int index = 0;

    public MaxDistance(){
        root = null;
    }

    //calculateSize() will calculate size of tree
    public int calculateSize(Node node)
    {
        int size = 0;
        if (node == null)
         return 0;
        else {
            size = calculateSize (node.left) + calculateSize (node.right) + 1;
            return size;
        }
    }

    //convertBTtoArray() will convert binary tree to its array representation
    public void convertBTtoArray(Node node) {
        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {
            if(node.left != null)
                convertBTtoArray(node.left);
            //Adds nodes of binary tree to treeArray
            treeArray[index] = node.data;
            index++;
            if(node.right != null)
                convertBTtoArray(node.right);
            }
    }

    //getDistance() will find distance between root and a specific node
    public int getDistance(Node temp, int n1) {
        if (temp != null) {
            int x = 0;
            if ((temp.data == n1) || (x = getDistance(temp.left, n1)) > 0
                    || (x = getDistance(temp.right, n1)) > 0) {
                //x will store the count of number of edges between temp and node n1
                return x + 1;
            }
            return 0;
        }
        return 0;
    }

    //lowestCommonAncestor() will find out the lowest common ancestor for nodes node1 and node2
    public Node lowestCommonAncestor(Node temp, int node1, int node2) {
        if (temp != null) {
            //If root is equal to either of node node1 or node2, return root
            if (temp.data == node1 || temp.data == node2) {
                return temp;
            }

            //Traverse through left and right subtree
            Node left = lowestCommonAncestor(temp.left, node1, node2);
            Node right = lowestCommonAncestor(temp.right, node1, node2);

            //If node temp has one node(node1 or node2) as left child and one node(node1 or node2) as right child
            //Then, return node temp  as lowest common ancestor
            if (left != null && right != null) {
                return temp;
            }

            //If nodes node1 and node2 are in left subtree
            if (left != null) {
                return left;
            }
            //If nodes node1 and node2 are in right subtree
            if (right != null) {
                return right;
            }
        }
        return null;
    }

    //findDistance() will find distance between two given nodes
    public int findDistance(int node1, int node2) {
        //Calculates distance of first node from root
        int d1 = getDistance(root, node1) - 1;
        //Calculates distance of second node from root
        int d2 = getDistance(root, node2) - 1;

        //Calculates lowest common ancestor of both the nodes
        Node ancestor = lowestCommonAncestor(root, node1, node2);

        //If lowest common ancestor is other than root then, subtract 2 * (distance of root to ancestor)
        int d3 = getDistance(root, ancestor.data) - 1;
        return (d1 + d2) - 2 * d3;
    }

    //nodesAtMaxDistance() will display the nodes which are at maximum distance
    public void nodesAtMaxDistance(Node node) {
        int maxDistance = 0, distance = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        //Initialize treeArray
        int treeSize = calculateSize(node);
        treeArray = new int[treeSize];

        //Convert binary tree to its array representation
        convertBTtoArray(node);

        //Calculates distance between all the nodes present in binary tree and stores maximum distance in variable maxDistance
        for(int i = 0; i < treeArray.length; i++) {
            for(int j = i; j < treeArray.length; j++) {
                distance = findDistance(treeArray[i], treeArray[j]);
                //If distance is greater than maxDistance then, maxDistance will hold the value of distance
                if(distance > maxDistance) {
                    maxDistance = distance;
                    arr.clear();
                    //Add nodes at position i and j to treeArray
                    arr.add(treeArray[i]);
                    arr.add(treeArray[j]);
                }
                //If more than one pair of nodes are at maxDistance then, add all pairs to treeArray
                else if(distance == maxDistance) {
                    arr.add(treeArray[i]);
                    arr.add(treeArray[j]);
                }
            }
        }
        //Display all pair of nodes which are at maximum distance
        System.out.println("Nodes which are at maximum distance: ");
        for(int i = 0; i < arr.size(); i = i + 2) {
            System.out.println("( " + arr.get(i) + "," + arr.get(i+1) + " )");
        }
    }

    public static void main(String[] args) {

        MaxDistance bt = new MaxDistance();
        //Add nodes to the binary tree
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);
        bt.root.right.right.right = new Node(8);
        bt.root.right.right.right.left = new Node(9);

        //Finds out all the pair of nodes which are at maximum distance
        bt.nodesAtMaxDistance(bt.root);
      }
*/
}
