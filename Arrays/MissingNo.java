package nikeeta;

public class MissingNo {

	 public static void findMissingNumbers(int[] arr, int max) {  
		for (int i = 1; i <= max; i++) {  
			boolean found = true;  
		   // for (int num : arr) {  
			for(int num = 0; num<arr.length; num++)
			{
				//if(num === i) {
				
				if (arr[num] == i) {  
					found = false;  
					break;  
				}  
			}  
			if (found) {  
	            	
	                System.out.print(i + " ");  
	                
	            }  
	        }  
	        System.out.println(); // Add a newline to separate the output.  
	    }  
	    public static void main(String[] args) {  
	        int[] arr = {1, 2, 4, 6, 7};  
	        int max = 7;  
	        System.out.println("Missing numbers in the array:");  
	        findMissingNumbers(arr, max);  
	    }  
	}  