package nikeeta;

import java.util.Scanner;

public class StringBui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        StringBuilder sb = new StringBuilder("nikeeta");
		        System.out.println(sb);
		          System.out.println(sb.charAt(0));
		     
		    //set char at index
		          sb.setCharAt(1, 'x');  
		          System.out.println("new string = " + sb);  
		          
		    //insert char
		    sb.insert(0,"n");
		    System.out.println(sb);

		    //delete 
		    sb.delete(2,4);

		    //append 
//		    sb.append("n");
//		     sb.append("n");
		    
		    System.out.println(sb);

		    //legnth
		    System.out.println(sb.length());
		    }
		}