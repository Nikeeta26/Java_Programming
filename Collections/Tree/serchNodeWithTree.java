/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // Base case: If the root is null or the value matches the current node's value
        if (root == null || root.val == val) {
            return root;
        }
        
        // If the value to find is smaller than the current node's value, search in the left subtree
        if (val < root.val) {
            return searchBST(root.left, val);
        } 
        
        // Otherwise, search in the right subtree
        return searchBST(root.right, val);
    }
}
