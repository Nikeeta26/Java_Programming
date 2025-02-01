package nikeeta;

import java.util.*;

public class SubArraySumOFTarget {

	    public static int[] findSubarrayWithSum(int[] nums, int target) {
	        int left = 0, sum = 0;

	        for (int right = 0; right < nums.length; right++) {
	            sum += nums[right];

	            while (sum > target && left <= right) {
	                sum -= nums[left++];
	            }

	            if (sum == target) {
	                return Arrays.copyOfRange(nums, left, right + 1);
	            }
	        }
	        return new int[0]; // Return empty array if no subarray found
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 7, 5};
	        int target = 12;
	        int[] result = findSubarrayWithSum(arr, target);

	        if (result.length > 0) {
	        	for(int i=0; i<result.length; i++) {
	        		System.out.println(result[i]);
	        	}
	        	// or
	           // System.out.println("Subarray with sum " + target + ": " + Arrays.toString(result));
	        } else {
	            System.out.println("No subarray found with sum " + target);
	        }
	    }
	}
