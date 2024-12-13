package nikeeta;

import java.util.LinkedList;
public class deleteMiddle  {
	    public static void main(String[] args) {
	        // Create a sample linked list: [1, 3, 4, 7, 1, 2, 6]
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(3);
	        head.next.next = new ListNode(4);
	        head.next.next.next = new ListNode(7);
	        head.next.next.next.next = new ListNode(1);
	        head.next.next.next.next.next = new ListNode(2);
	        head.next.next.next.next.next.next = new ListNode(6);

	        // Print the original list
	        System.out.println("Original List:");
	        printList(head);

	        // Delete the middle node
	        Solution solution = new Solution();
	        head = solution.deleteMiddle(head);

	        // Print the modified list
	        System.out.println("Modified List:");
	        printList(head);
	    }

	    // Utility method to print a linked list
	    private static void printList(ListNode head) {
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}

	// ListNode definition
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

	// Solution class
	class Solution {
	    public ListNode deleteMiddle(ListNode head) {
	        // If the list is empty or has only one node, return null
	        if (head == null || head.next == null) {
	            return null;
	        }

	        // Initialize slow and fast pointers
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode prev = null;

	        // Move fast pointer two steps and slow pointer one step
	        while (fast != null && fast.next != null) {
	            prev = slow;          // Track the node before the middle
	            slow = slow.next;     // Move slow pointer
	            fast = fast.next.next; // Move fast pointer
	        }

	        // Delete the middle node
	        if (prev != null) {
	            prev.next = slow.next;
	        }

	        return head;
	    }
	}
