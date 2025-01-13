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

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Iterations:

i=1:
ans[1]=ans[1≫1]+(1&1)=ans[0]+1=0+1=1
ans=[0,1,0,0,0,0]
..

i=5:
ans[5]=ans[5≫1]+(5&1)=ans[2]+1=1+1=2

ans=[0,1,1,2,1,2]