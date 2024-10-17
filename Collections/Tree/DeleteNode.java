  leaf node
  no clild 
  two children

  package nikeeta;

public class DeleteNode {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data <= root.data) {
            root.left = Insert(root.left, data);
        } else {
            root.right = Insert(root.right, data);
        }
        return root;
    }

    public static void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static Node Delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = Delete(root.left, key);
        } else if (key > root.data) {
            root.right = Delete(root.right, key);
        } else {
            // Found the node to be deleted

            // Case 1: No children
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node Is = InorderSuccessor(root.right);
            root.data = Is.data;
            root.right = Delete(root.right, Is.data);
        }

        return root;
    }

    public static Node InorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        Node node = null;

        for (int i = 0; i < arr.length; i++) {
            node = Insert(node, arr[i]);
        }

        System.out.println("Preorder traversal before deletion:");
        Preorder(node);
        System.out.println();

        node = Delete(node, 4);

        System.out.println("Preorder traversal after deletion of 4:");
        Preorder(node);
        System.out.println();
    }
}
