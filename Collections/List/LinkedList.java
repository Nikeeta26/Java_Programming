package nikeeta;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

	    Node head;

	    // Insert a new node at the end
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        
	        Node temp = head;
	        
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    // Print the linked list
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    // Reverse the linked list (Iterative method)
	    public void reverse() {
	        Node prev = null;
	        Node current = head;
	        Node next = null;
	        
	        while (current != null) {
	            next = current.next;  // Store next node
	            current.next = prev;  // Reverse current node's pointer
	            prev = current;       // Move prev forward
	            current = next;       // Move current forward
	        }
	        
	        head = prev;  // Update head to the new first node
	    }
	

	public static void main(String[] args) {
		 LinkedList list = new LinkedList();
	        
	        // Insert elements
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);
	        list.insert(5);

	        System.out.println("Original Linked List:");
	        list.printList(); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null

	        // Reverse the list
	        list.reverse();
 
	        System.out.println("Reversed Linked List:");
	        list.printList(); // Output: 5 -> 4 -> 3 -> 2 -> 1 -> null
	    }
	}



	head → [1] → [2] → [3] → null
	Insert 4
	Start at head (temp = head).
	Move through the list (temp = temp.next), stopping at [3] (since temp.next == null).
	Attach newNode (4) to the last node:
	css
	Copy
	Edit
	head → [1] → [2] → [3] → [4] → null