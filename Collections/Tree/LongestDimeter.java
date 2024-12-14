package nikeeta;

import java.util.ArrayList;
import java.util.List;

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

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    static class NodeInfo {
        int diameter;
        int height;
        List<Integer> path;

        NodeInfo(int diameter, int height, List<Integer> path) {
            this.diameter = diameter;
            this.height = height;
            this.path = path;
        }
    }

    // Optimized method to calculate diameter, height, and track the longest path
    public static NodeInfo calculateDiameter(Node root) {
        if (root == null) {
            return new NodeInfo(0, 0, new ArrayList<>()); // Diameter = 0, Height = 0, Empty path
        }

        // Recursive call for left and right subtrees
        NodeInfo leftInfo = calculateDiameter(root.left);
        NodeInfo rightInfo = calculateDiameter(root.right);

        // Calculate height for the current node
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        // Calculate diameter passing through the current node
        int rootDiameter = leftInfo.height + rightInfo.height + 1;

        // Determine the path for the current node's diameter
        List<Integer> rootPath = new ArrayList<>();
        if (leftInfo.height >= rightInfo.height) {
            rootPath.addAll(leftInfo.path);
        } else {
            rootPath.addAll(rightInfo.path);
        }
        rootPath.add(root.data);

        // Overall diameter and path
        int diameter;
        List<Integer> finalPath;
        if (rootDiameter > Math.max(leftInfo.diameter, rightInfo.diameter)) {
            diameter = rootDiameter;
            finalPath = new ArrayList<>(leftInfo.path);
            finalPath.add(root.data);
            finalPath.addAll(rightInfo.path);
        } else if (leftInfo.diameter >= rightInfo.diameter) {
            diameter = leftInfo.diameter;
            finalPath = leftInfo.path;
        } else {
            diameter = rightInfo.diameter;
            finalPath = rightInfo.path;
        }

        return new NodeInfo(diameter, height, finalPath);
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        NodeInfo result = calculateDiameter(root);

        System.out.println("The height of the tree is: " + (result.height - 1)); // Height = Edges from root to leaf
        System.out.println("The diameter of the tree is: " + (result.diameter - 1)); // Diameter = Edges in longest path
        System.out.print("The nodes on the longest path are: ");
        for (int node : result.path) {
            System.out.print(node + " ");
        }
    }
}
