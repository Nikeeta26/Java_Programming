class Solution {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
           curr = curr + gain[i];
           max = Math.max(curr,max);
        }
        return max;
    }
}

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.