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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0L, 1); // Default prefix sum to handle cases where the path equals targetSum
        return dfs(root, 0L, targetSum, prefixSumMap);
    }

    private int dfs(TreeNode node, long currentSum, int targetSum, HashMap<Long, Integer> prefixSumMap) {
        if (node == null) {
            return 0;
        }

        // Add current node's value to the cumulative sum
        currentSum += node.val;

        // Check how many paths with sum (currentSum - targetSum) exist
        int numPaths = prefixSumMap.getOrDefault(currentSum - targetSum, 0);

        // Update the prefix sum map
        prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

        // Recurse on left and right children
        numPaths += dfs(node.left, currentSum, targetSum, prefixSumMap);
        numPaths += dfs(node.right, currentSum, targetSum, prefixSumMap);

        // Backtrack: remove the current sum from the map
        prefixSumMap.put(currentSum, prefixSumMap.get(currentSum) - 1);

        return numPaths;
    }

    public static void main(String[] args) {
        // Example tree for testing
        TreeNode root = new TreeNode(1000000000);
        root.left = new TreeNode(1000000000);
        root.left.left = new TreeNode(294967296);
        root.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left = new TreeNode(1000000000);
        root.left.left.left.left.left = new TreeNode(1000000000);

        int targetSum = 0;
        Solution solution = new Solution();
        System.out.println("Number of paths with sum " + targetSum + ": " + solution.pathSum(root, targetSum));
    }
}