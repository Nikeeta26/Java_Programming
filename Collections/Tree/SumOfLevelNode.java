package nikeeta;

import java.util.LinkedList;
import java.util.Queue;

public class SumofNlevelNode {

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

    static class show {
        static int ind = -1;

        public static Node tree(int arr[]) {
            ind++;
            if (arr[ind] == -1) {
                return null;
            }

            Node nodes = new Node(arr[ind]);
            nodes.left = tree(arr);
            nodes.right = tree(arr);

            return nodes;  // Corrected: return the built node, not null
        }
    }

    public static int sum(Node root, int n) {
        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int currentLevel = 0;
        int sum = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            // Sum the nodes at the desired level
            if (currentLevel == n) {
                for (int i = 0; i < size; i++) {
                    Node currentNode = q.remove();
                    sum += currentNode.data;
                }
                break; // No need to process further levels
            }

            // Process the next level's nodes
            for (int i = 0; i < size; i++) {
                Node currentNode = q.remove();
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
            currentLevel++;
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        show s = new show();
        Node root = s.tree(arr);

        int level = 2;
        System.out.println("Sum of nodes at level " + level + ": " + sum(root, level));
    }
}
