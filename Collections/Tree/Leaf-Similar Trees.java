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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // Get the leaf sequences for both trees
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        
        // Collect leaf nodes for both trees
        collectLeaves(root1, leaves1);
        collectLeaves(root2, leaves2);
        
        // Compare the two lists of leaves
        return leaves1.equals(leaves2);
    }
    
    private void collectLeaves(TreeNode root, List<Integer> leaves) {
        if (root == null) {
            return;
        }
        
        // If it's a leaf node (no left and right child), add the value to leaves
        if (root.left == null && root.right == null) {
            leaves.add(root.val);
        } else {
            // Recurse for both left and right children
            collectLeaves(root.left, leaves);
            collectLeaves(root.right, leaves);
        }
    }
}
