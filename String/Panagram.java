package nikeeta;

import java.util.HashSet;

public class Panagram {

	    public static void main(String[] args) {
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

