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

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binaryTree b = new binaryTree();
        Node root = b.Tree(nodes);
        System.out.println("The number of levels in the tree is: " + CountLevel(root));
    }
}
