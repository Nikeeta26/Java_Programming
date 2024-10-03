package nikeeta;

import java.util.Arrays;

public class RotateArray {
	  private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	  
	  public static void rotate(int[] arr, int n) {
	        int length = arr.length;

	        // Normalize rotations in case n is larger than array size
	        n = n % length;

	        // Step 1: Reverse the entire array
	        reverse(arr, 0, length - 1);

	        // Step 2: Reverse the first 'n' elements
	        reverse(arr, 0, n - 1);

	        // Step 3: Reverse the remaining elements from 'n' to the end of the array
	        reverse(arr, n, length - 1);
	    }
	public static void main(String[] args) {
		  String envValue = System.getenv("ARRAY_ROTATION");
	        int n = (envValue != null) ? Integer.parseInt(envValue) : 3; // Default rotation is 3 if env var not set

	        int[] arr = {1, 2, 3, 4, 5, 6, 7};
	        int m =4;
	        System.out.println("Original Array: " + Arrays.toString(arr));

	        // Rotate array by 'n' positions
	        rotate(arr, m);

	        System.out.println("Rotated Array by " + n + " positions: " + Arrays.toString(arr));
	 	// TODO Auto-generated method stub

	}

}
