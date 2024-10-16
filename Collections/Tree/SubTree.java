package nikeeta;

public class SubTree {

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

    static class BuildTree {
        static int ind;

        public static Node show(int arr[]) {
            if (ind >= arr.length || arr[ind] == -1) {
                ind++;
                return null;
            }

            Node node = new Node(arr[ind++]);
            node.left = show(arr);
            node.right = show(arr);

            return node;
        }
    }

    public static boolean isIdenticall(Node root, Node subtree) {
        if (root == null && subtree == null) {
            return true;
        }

        if (root == null || subtree == null) {
            return false;
        }

        if (root.data == subtree.data) {
            return isIdenticall(root.left, subtree.left) &&
                   isIdenticall(root.right, subtree.right);
        }
        return false;
    }

    public static boolean subTree(Node root, Node subtree) {
        if (subtree == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (root.data == subtree.data) {
            if (isIdenticall(root, subtree)) {
                return true;
            }
        }

        return subTree(root.left, subtree) || subTree(root.right, subtree);
    }

    public static void main(String[] args) {
//        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        int[] arr2 ={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};  // Adjusted the subtree structure to match the correct format
        
    	int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    	int[] arr2 = {2, 4, -1, -1, 5, -1};  // This should return true

    	
        BuildTree node= new BuildTree();
        //node.ind = 0;
        Node root = node.show(arr);
        
        BuildTree node1 = new BuildTree(); 
      //  node1.ind = 0;// Reset index for building the second tree
        Node subtree = node.show(arr2);

        System.out.println(subTree(root, subtree));
    }
}
