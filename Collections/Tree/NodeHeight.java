package nikeeta;

import nikeeta.SumOfNode.Node;
import nikeeta.SumOfNode.binaryTree;

public class NodeLevel {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binaryTree {
        static int ind = -1;

        public static Node Tree(int nodes[]) {
            ind++;
            if (ind >= nodes.length || nodes[ind] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[ind]);
            newNode.left = Tree(nodes);
            newNode.right = Tree(nodes);

            return newNode;
        }
    }

    static int CountLevel(Node root) {
        if (root == null) {
            return 0;
        }

        int left = CountLevel(root.left);
        int right = CountLevel(root.right);

        return Math.max(left, right) + 1;
    }
    
    static int dimetetr(Node root) {
    	if(root == null) {
    		return 0;
    	}
    	
    	int left = dimetetr(root.left);
    	int right = dimetetr(root.right);
    	int d3 = CountLevel(root.left)+CountLevel(root.right)+1;
    	
    	return Math.max(d3,  Math.max(right, left));
    		
    }

    static class NodeInfo {
        int di;
        int ht;

        NodeInfo(int di, int ht) {
            this.di = di;
            this.ht = ht;
        }
    }

    static NodeInfo Dimeter(Node root) {
        if (root == null) {
            return new NodeInfo(0, 0);
        }
        NodeInfo left = Dimeter(root.left);
        NodeInfo right = Dimeter(root.right);

        int height = Math.max(left.ht, right.ht) + 1;
//        int leftdi = left.di;
//        int rightdi = right.di;
        int di = Math.max(left.di, right.di);
        int d3 = left.ht + right.ht + 1;

//        int myDim = Math.max(Math.max(leftdi, rightdi), d3);
        int myDim = Math.max(di,d3);
        return new NodeInfo(myDim, height);
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binaryTree b = new binaryTree();
        Node root = b.Tree(nodes);
        System.out.println("The number of levels in the tree is: " + CountLevel(root));
        System.out.println("level:"+ dimetetr(root));
        System.out.println("The diameter of the tree is: " + Dimeter(root).di);
    }
}
