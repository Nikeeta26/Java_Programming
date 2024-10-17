package nikeeta;

public class SerchNode {

	public static class Node{
		int data;
		Node left; 
		Node right;
		
		Node(int data){
			this.data = data;
			
		}
	}
	
	public static Node Insert(Node root, int data) {
		
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(root.data >= data) {
			root.left = Insert(root.left, data);
		}
		
		else  {
			root.right = Insert(root.right, data);
		}
		return root;
		
	}
	
	public static void Preorder(Node root) {
		if(root == null) {
			
			return;
			
		}
		Preorder(root.left);
		System.out.println(root.data);
		Preorder(root.right);
		
	}
	public static boolean search(Node root, int key) {
		if(root == null) {
			return false;
		}
		
		if(root.data == key) {
			return true;
		}
		else if(root.data >= key) {
			return search(root.left, key);
		}
		else {
			return search(root.right, key);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {4,8};
Node node = null;

for(int i=0;i<arr.length; i++) {
	node = Insert(node, arr[i]);
}

Preorder(node);

if(search(node,8)) {
  System.out.println("found");
}
else {
	System.out.println("not found");
}
	}

}
