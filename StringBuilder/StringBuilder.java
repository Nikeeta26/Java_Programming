package nikeeta;

import java.util.Scanner;

public class StringBuilder {

	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("nikeeta");
        System.out.println(sb);
          System.out.println(sb.charAt(0));
     
    //set char at index
   sb.setCharAt(0,"p");
      System.out.println(sb);

    //insert char
    sb.insert(0,"n")
    System.out.println(sb);

    //delete 
    sb.delete(2,3);

    //append 
    sb.append("n");
     sb.append("n");
    
    System.out.println(sb);

    //legnth
    System.out.println(sb.legnth());
    }
}