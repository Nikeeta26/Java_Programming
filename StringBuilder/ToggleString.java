package nikeeta;

import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements");
        int n = sc.nextInt();
        
        String binaryString = Integer.toBinaryString(n);
        		System.out.println(binaryString);
        			
        		StringBuilder toggledBinaryString = new StringBuilder();
        		
        		 for (int i = 0; i < binaryString.length(); i++) {
        	            if (binaryString.charAt(i) == '1') {
        	            	
        	                toggledBinaryString.append('0');
        	                
        	            } else {
        	            	
        	                toggledBinaryString.append('1');
        	                
        	            }
        	        }
        		 
        		 int result = Integer.parseInt(toggledBinaryString.toString(),2);
        		 System.out.println(result);
	}

}
