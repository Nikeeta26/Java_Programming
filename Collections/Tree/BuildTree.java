package nikeeta;

import java.util.*;

public class BinaryTree {

	public static class Node{
		int data;
		Node left;
		Node right;
		
		 
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
		
	}
	
	static class binaryTree{
		static int ind = -1;
		public static Node buildTree(int nodes[]) {
			ind++;
			if(nodes[ind] == -1) {
				return null;
								
			}
			
			Node newNode = new Node(nodes[ind]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
			
		}
		
	}
	
	public static void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) { // O(n)
        if(root == null) {
           // System.out.print(-1+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
	
	public static void postorder(Node root) { // O(n)
		if(root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void levelOrder(Node root) {
		if(root == null) {
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currentNode = q.remove();
			if(currentNode == null) {
				System.out.println();
				
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(currentNode.data);
				if(currentNode.left != null) {
					q.add(currentNode.left);
				}
				
				if(currentNode.right != null) {
					q.add(currentNode.right);
				}
			}
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println("\t");
        postorder(root);
        System.out.println("\t");
        inorder(root);
        
        levelOrder(root);
	}

}
