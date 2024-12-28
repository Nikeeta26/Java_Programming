package nikeeta;
// Binary Search Tree.
public class BTS {

	public static class Node{
		int data; 
		Node left;
		Node right;
		Node(int data){
			this.data=data;
		}
	}
	
	public static Node insert(Node root, int data) {  // O(H)
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(root.data >= data) {
			root.left = insert(root.left, data);
		}
		
		else {
			root.right = insert(root.right,data);
		}
		return root;
		
	}
	
	public static void Inoder(Node root) {
		 if (root == null) {
	            return;
	        }
		
		 Inoder(root.left);
		 
		 System.out.println(root.data);
	
		 Inoder(root.right);
		 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,6,8,0,4};

Node root = null;

for(int i=0; i<arr.length; i++) {
	root = insert(root, arr[i]);
	
}

Inoder(root);

	}

}
