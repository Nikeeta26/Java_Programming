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
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow);
        ListNode first = head;

int maxSum = 0;
      while(second != null){
        maxSum = Math.max(maxSum, second.val+first.val);
        first = first.next;
        second = second.next;
      }
        return maxSum;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
          ListNode next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;

        }
        return prev;
    }
}

For example, if n = 4, then node 0 is the twin of node 3,
 and node 1 is the twin of node 2. 
 These are the only nodes with twins for n = 4.

 Input: head = [5,4,2,1]
Output: 6
Explanation:
Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
There are no other nodes with twins in the linked list.
Thus, the maximum twin sum of the linked list is 6. 