package nikeeta;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word
        
        String str1= "Geeks", nstr="";
         
        char ch;
        
        for (int i=0; i<str1.length(); i++)
        {
          ch= str1.charAt(i); //extracts each character
          nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr+"\t");
    }
}