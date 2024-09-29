package nikeeta;

public class ReverseRotatinal {

	public static boolean isRotation(String s1, String s2) {
        // Check if the strings have the same length and are not empty
        if (s1.length() != s2.length() || s1.length() == 0) {
            return false;
        }

        // Concatenate s1 with itself
        String concatenated = s1 + s1;

        // Check if s2 is a substring of the concatenated string
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
        
       
        
    }
}