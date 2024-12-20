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
    public int longestZigZag(TreeNode root) {
        return dfs(root, true, 0);
    }

    private int dfs(TreeNode node, boolean isLeft, int depth) {
        if (node == null) {
            return depth - 1;
        }

        int left = dfs(node.left, false, isLeft ? depth + 1 : 1);
        int right = dfs(node.right, true, !isLeft ? depth + 1 : 1);

        return Math.max(left, right);
    }

   }