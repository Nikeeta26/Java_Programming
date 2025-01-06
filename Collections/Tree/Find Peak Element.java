public class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Compare mid element with its neighbors
            if ((mid == 0 || nums[mid] > nums[mid - 1]) && 
                (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
                return mid; // Peak element found
            } 
            // If the element on the right is greater, move to the right half
            else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } 
            // Otherwise, move to the left half
            else {
                high = mid - 1;
            }
        }

        return -1; // This line will never be reached if the input is valid
    }
}
