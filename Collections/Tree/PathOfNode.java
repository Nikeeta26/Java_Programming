package nikeeta;

import java.util.*;

public class PathOfNode {

	public static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	
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

	
	public static void Ineorder(Node root) {
		if(root == null) {
			return;
		}
		Ineorder(root.left);
		System.out.println(root.data);
		Ineorder(root.right);
	}
	
	public static void PrintPath(Node root, ArrayList<Integer> path) {
		if(root == null) {
			return;
		}
		
		path.add(root.data);
		
		if(root.left == null && root.right == null) {
			Path(path);
		}
		else {
			PrintPath(root.left, path);
			PrintPath(root.right, path);
		}
		
		path.remove(path.size()-1);
	}
	
	public static void Path(ArrayList<Integer> path) {
		for(int i=0; i<path.size(); i++) {
			System.out.print(path.get(i)+" -> ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {4,6,3,2,1,8,9,0,7};

Node node = null;

for(int i=0; i<arr.length; i++) {
	node = Insert(node, arr[i]);
}

Ineorder(node);

PrintPath(node,new ArrayList<>());
	}

}
