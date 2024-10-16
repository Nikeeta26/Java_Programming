package nikeeta;

public class BTS {

	public static class Node{
		int data; 
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	
	public static Node insert(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(root.data >= data) {
			insert(root.left, data);
		}
		return root;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
