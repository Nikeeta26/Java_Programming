package nikeeta;

import java.util.HashSet;

public class Panagram {

	    public static void main(String[] args) {


			String s = "The quick brown fox jumps over the lazy dog";
		
			HashSet<Character> h = new HashSet<>();
			 
			char c[] = s.toCharArray();
			 
			for(int i=0; i<c.length; i++){
				if(c[i]>='a' && c[i]<='z') {
					h.add(c[i]);
				}
			}
			
			if(h.size() == 26) {
				System.out.println("String is panagram ");
			}
			else {
				System.out.println("not panagram");
			}

             // or

	        String str = "The quick brown fox jumps over the lazy dog";
	        if (isPangram(str)) {
	            System.out.println("The string is a pangram.");
	        } else {
	            System.out.println("The string is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String str) {
	        HashSet<Character> h = new HashSet<>();
	        
	        // Convert the string to lowercase to handle case insensitivity
	        str = str.toLowerCase();

	        for (char c : str.toCharArray()) {
	            // Check if the character is a letter and add it to the set
	            if (c >= 'a' && c <= 'z') {
	                h.add(c);
	            }
	        }

	        // Check if the set contains all 26 letters
	        return h.size() == 26;
	    }
	}

