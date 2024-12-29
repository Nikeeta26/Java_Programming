
import java.util.ArrayList;

public class PathOfNode {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Method to insert a node into the BST
    public static Node Insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (root.data > data) {
            root.left = Insert(root.left, data);
        } else if (root.data < data) {
            root.right = Insert(root.right, data);
        }
        return root;
    }

    // Method to find all paths with a given sum
    public static void FindPaths(Node root, int targetSum) {
        ArrayList<Integer> currentPath = new ArrayList<>();
        FindPathsHelper(root, targetSum, currentPath);
    }

    // Helper method to perform DFS and find paths
     static void FindPathsHelper(Node root, int targetSum, ArrayList<Integer> currentPath) {
        if (root == null) {
            return;
        }

        // Add the current node to the path
        currentPath.add(root.data);

        // Check all sub-paths in the current path
        int sum = 0;
        
        for (int i = currentPath.size() - 1; i >= 0; i--) {
            sum += currentPath.get(i);
            if (sum == targetSum) {
                PrintPath(currentPath, i);
            }
        }

        // Explore left and right subtrees
        FindPathsHelper(root.left, targetSum, currentPath);
        FindPathsHelper(root.right, targetSum, currentPath);

        // Backtrack: remove the current node from the path
        currentPath.remove(currentPath.size() - 1);
    }

    Method to print a path from a given starting index
    private static void PrintPath(ArrayList<Integer> path, int startIndex) {
        for (int i = startIndex; i < path.size(); i++) {
            System.out.print(path.get(i) + (i == path.size() - 1 ? "" : " -> "));
        }
        System.out.println();
    }

    // Method to print the BST structure for debugging
    // public static void PrintTree(Node root, String indent) {
    //     if (root != null) {
    //         PrintTree(root.right, indent + "   ");
    //         System.out.println(indent + root.data);
    //         PrintTree(root.left, indent + "   ");
    //     }
    // }

    public static void main(String[] args) {
        int arr[] = {4, 6, 3, 2, 1, 8, 9, 0, 7};
        int targetSum = 8; // The target sum to find

        Node node = null;

        // Construct the BST
        for (int i = 0; i < arr.length; i++) {
            node = Insert(node, arr[i]);
        }

        // Print the BST structure for debugging
        System.out.println("BST Structure:");
        PrintTree(node, "");

        
        // Find and print all paths with the target sum
        System.out.println("Paths with sum " + targetSum + ":");
     //   FindPaths(node, targetSum);
        FindPathsHelper(node, targetSum, new ArrayList<Integer>() );
    }
}
