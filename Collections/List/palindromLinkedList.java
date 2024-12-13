/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PalindromLikedList {
    public  boolean isPalindrome(ListNode head) {
         if (head == null || head.next == null) {
            return true; // Empty or single-node list is a palindrome
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!= null){
                      slow = slow.next;
                      fast = fast.next.next;
        }

             ListNode second = reverseList(slow);
             ListNode first = head;

             while(second != null){
                if(first.val != second.val){
                    return false;
                }
                first = first.next;
                second = second.next;
             }

     return true; // All values matched

    }

     private ListNode reverseList(ListNode head) {
             ListNode curr = head;
             ListNode prev = null;

             while(curr!=null){
                ListNode next = curr.next;
                next = prev;
                prev = curr;
                curr = curr.next;

             }
             return prev;
     }

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
	      boolean b = solution.isPalindrome(head);
              System.out.println("ans:"+b);
	        // Print the modified list
	        
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