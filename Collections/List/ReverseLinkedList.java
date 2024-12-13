package nikeeta;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a sample linked list: [1 → 2 → 3 → 4]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print the original list
        System.out.println("Original List:");
        printList(head);

        // Reverse the linked list
        Soluti solution = new Soluti();
        head = solution.reverseList(head);

        // Print the reversed list
        System.out.println("Reversed List:");
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
class Soluti {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // To store the previous node
        ListNode curr = head; // To traverse the list

        while (curr != null) {
            ListNode next = curr.next; // Step 1: Save the next node
            curr.next = prev;          // Step 2: Reverse the pointer
            prev = curr;               // Step 3: Move prev forward
            curr = next;               // Step 4: Move curr forward
        }

        // Return the new head (prev will be at the head of the reversed list)
        return prev;
    }
}

