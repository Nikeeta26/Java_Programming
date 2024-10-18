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

    
    public static void Range(Node root, int x, int y) {
    	if(root == null) {
    		return;
    	}
    	if(root.data >= x && root.data<= y) {

    		Range(root.left, x, y);
    		System.out.print(root.data+" ");
    		Range(root.right,x,y);

    	}
    	else if(root.data >= y){
    		Range(root.left, x, y);
    	}
    	else {
    		Range(root.right, x, y);
    	}
		
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

        
        Range(node, 4,8);
    }
}
