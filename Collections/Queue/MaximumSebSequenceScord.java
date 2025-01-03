import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;

        // Pair nums1[i] and nums2[i] together and sort by nums2[i] in descending order
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }
        Arrays.sort(pairs, (a, b) -> b[1] - a[1]);

        // Min-heap to track the top k elements from nums1
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sum = 0;
        long maxScore = 0;

        // Iterate through the pairs
        for (int i = 0; i < n; i++) {
            int num1 = pairs[i][0];
            int num2 = pairs[i][1];

            // Add the current nums1 value to the heap and update the sum
            minHeap.add(num1);
            sum += num1;

            // If the heap exceeds size k, remove the smallest value
            if (minHeap.size() > k) {
                sum -= minHeap.poll();
            }

            // If we have exactly k elements, calculate the score
            if (minHeap.size() == k) {
                maxScore = Math.max(maxScore, sum * num2);
            }
        }

        return maxScore;
    }
}


Input: nums1 = [1,3,3,2], nums2 = [2,1,3,4], k = 3
Output: 12
Explanation: 
The four possible subsequence scores are:
- We choose the indices 0, 1, and 2 with score = (1+3+3) * min(2,1,3) = 7.
- We choose the indices 0, 1, and 3 with score = (1+3+2) * min(2,1,4) = 6. 
- We choose the indices 0, 2, and 3 with score = (1+3+2) * min(2,3,4) = 12. 
- We choose the indices 1, 2, and 3 with score = (3+3+2) * min(1,3,4) = 8.
Therefore, we return the max score, which is 12.
Example 2:

Input: nums1 = [4,2,3,1,1], nums2 = [7,5,10,9,6], k = 1
Output: 30
Explanation: 
Choosing index 2 is optimal: nums1[2] * nums2[2] = 3 * 10 = 30 is the maximum possible score.