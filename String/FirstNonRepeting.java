package nikeeta;

public class FirstNonRepeting {

	    // Function to find the index of the first 
	    // non-repeating character
	    static char nonRepeatingChar(String s) {
	        int n = s.length();

	        // Iterate over each character in the string
	        for (int i = 0; i < n; ++i) {
	            boolean found = false;

	            // Check if the character repeats in the
	            // rest of the string
	            for (int j = 0; j < n; ++j) {
	                if (i != j && s.charAt(i) == s.charAt(j)) {
	                    found = true;
	                    break;
	                }
	            }

	            // If character does not repeat, return it
	            if (found == false) 
	                return s.charAt(i);
	        }

	        // If no such character is found, return '$'
	        return '$';
	    }

	    public static void main(String[] args) {
	        String s = "racecar";
	      
	        System.out.println(nonRepeatingChar(s));
	    }
	}
	
