package nikeeta;

public class RemoveNthNodeFromLinkedList {

    // Make Node a static class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null; // Fix the incorrect initialization
        }
    }

    // Insert a node at the end of the linked list
    public static Node insert(Node head, int data) {
        Node newnode = new Node(data);

        // If list is empty, new node becomes head
        if (head == null) {
            return newnode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head; // Return the updated head
    }

    public static Node reverse(Node head) {
    	Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;  // Store next node
            current.next = prev;  // Reverse current node's pointer
            prev = current;       // Move prev forward
            current = next;       // Move current forward
        }
        
        return prev;
    	
    }
    // Print the linked list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next; // Corrected infinite loop issue
        }
        System.out.println("NULL");
    }
    
    public static Node deleteNthFromEnd(Node head, int n) {
        Node dummy = new Node(0); // Dummy node to handle edge cases
        dummy.next = head;
        Node first = dummy, second = dummy;

        // Move `first` n+1 steps ahead to maintain the gap
        for (int i = 0; i <= n; i++) {
            if (first == null) return head; // If n is greater than list size
            first = first.next;
        }

        // Move both pointers until `first` reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from end
        second.next = second.next.next;

        return dummy.next; // Return the updated head
    }

    public static void main(String[] args) {
        Node head = null;

        // Insert nodes correctly
        head = insert(head, 5);
        head = insert(head, 10);
        head = insert(head, 15);
        head = insert(head, 20);
        head = insert(head, 25);

        // Print the list
        System.out.print("Original List: ");
        print(head);
        
        head = reverse(head);
        print(head);
        
         head = deleteNthFromEnd(head, 3);
         print(head);
    }
}
