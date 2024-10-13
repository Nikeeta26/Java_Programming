package nikeeta;

import java.util.Arrays;

public class ProductOfArray {

//	    public static int[] productExceptSelf(int[] arr) {
//	        int n = arr.length;
//	        int[] prod = new int[n];
//	        Arrays.fill(prod, 1);
//
//	        for (int i = 0; i < n; i++) {
//	            for (int j = 0; j < n; j++) {
//	                if (i != j) {
//	                    prod[i] *= arr[j];
//	                }
//	            }
//	        }
//	        return prod;
//	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 3, 5, 6, 2};
//	        int[] res = productExceptSelf(arr);
//	        System.out.println("Product of array except itself: " + Arrays.toString(res));
	        
	        int n = arr.length;
	        int[] prod = new int[n];
	        Arrays.fill(prod, 1);

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i != j) {
	                    prod[i] *= arr[j];
	                }
	            }
	        }
			
	        for(int i : prod) {
	        	 System.out.println(i);
	        }
	       
	    }
	}
