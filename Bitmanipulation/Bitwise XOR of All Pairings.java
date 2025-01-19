class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;

        // Compute XOR of all elements in nums1
        for (int num : nums1) {
            xor1 ^= num;
        }

        // Compute XOR of all elements in nums2
        for (int num : nums2) {
            xor2 ^= num;
        }

        int result = 0;

        // If nums1.length is odd, include xor2
        if (nums1.length % 2 != 0) {
            result ^= xor2;
        }

        // If nums2.length is odd, include xor1
        if (nums2.length % 2 != 0) {
            result ^= xor1;
        }

        return result;
    }
}
