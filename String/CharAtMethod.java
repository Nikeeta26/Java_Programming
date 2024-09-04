package nikeeta;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  Scanner sc = new Scanner(System.in);
  String s4 = sc.nextLine();
  for(int i=0; i<s4.length(); i++){
         System.out.println(s4.charAt(i));
  }

   String email = "gvhkjnmn@kjkkjk";
		 String userName = "";
		for(int i=0; i<email.length(); i++) {
		       if(email.charAt(i) == '@') {
		        break;
		       } else {
		         userName += email.charAt(i);
		       }
		     }
System.out.println(userName);
    }
}
