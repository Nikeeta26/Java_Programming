package nikeeta;

import nikeeta.BinaryTree.Node;
import nikeeta.BinaryTree.binaryTree;

public class CountNode {

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
	
	public static int count(Node root) {
		if(root == null) {
			return 0;
		}
		   int left = count(root.left);
		   int right = count(root.right);
		   
		return left+right+1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binaryTree tree = new binaryTree();
        Node root = tree.buildTree(nodes);
       // System.out.println(root.data);
        System.out.println(count(root));
      
	}

}
