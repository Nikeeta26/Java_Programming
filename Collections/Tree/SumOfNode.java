package nikeeta;

import nikeeta.CountNode.Node;
import nikeeta.CountNode.binaryTree;

public class SumOfNode {

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
	
	public static int node(Node root) {
		if(root == null) {
			return 0;
		}
		
		int left = node(root.left);
		int right = node(root.right);
		
		
		return left+right+root.data;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		binaryTree b = new binaryTree();
		Node node =b.buildTree(nodes);
		//System.out.println(node.data);
		System.out.println();
		System.out.println(node(node));
	}

}
