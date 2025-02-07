class Solution {

    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productMap = new HashMap<>();
        int count = 0;

        // Step 1: Store all product pairs in a hashmap
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productMap.put(product, productMap.getOrDefault(product, 0) + 1);
            } 
        }

        // Step 2: Calculate valid tuples from the hashmap
        for (int freq : productMap.values()) {
            if (freq > 1) {
                count += (freq * (freq - 1)) / 2 * 8; // Multiply by 8 for all permutations
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 6};
        System.out.println(tupleSameProduct(nums1)); // Output: 8

        int[] nums2 = {1, 2, 4, 5, 10};
        System.out.println(tupleSameProduct(nums2)); // Output: 16
    }
}

Input: nums = [2,3,4,6]
Output: 8
Explanation: There are 8 valid tuples:
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)

nums = [1,2,4,5,10]
Output: 16
Explanation: There are 16 valid tuples:
(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,5,4)
(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)