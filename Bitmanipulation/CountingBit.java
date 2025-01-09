class Solution {
    public int[] countBits(int n) {
        // Initialize the result array
        int[] ans = new int[n + 1];
        
        // Fill the array using the DP relation
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1); // Use right shift and bitwise AND
        }
        
        return ans; // Return the result
    }
}
