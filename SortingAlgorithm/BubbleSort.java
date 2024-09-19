package nikeeta;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] n = {2, 4, 5, 9, 1, 2, 4, 5, 6, 7, 7987, 0, 4, 3};
	        int temp;

            for (int i = 0; i < n.length - 1; i++) {
	            for (int j = 0; j < n.length - 1 - i; j++) {
	                if (n[j] > n[j + 1]) {

	                    temp = n[j];
	                    n[j] = n[j + 1];
	                    n[j + 1] = temp;
                        
	                }
	            }
         }
           System.out.println("Sorted Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
    }
}