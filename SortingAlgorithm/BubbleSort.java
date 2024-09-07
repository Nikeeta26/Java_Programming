package nikeeta;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         for(int i=0;i<arr.length;i++)
         {
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[i]>arr[i+1]){
                    //swap
                      int temp = arr[i];
                      arr[i] = arr[i+1];
                      arr[i+1] = temp;
                }
            }
         }
           System.out.println("Sorted Array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
    }
}