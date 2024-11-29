package nikeeta;

public class Reverse_Vowels_of_String {
	public static void reverseVowels(String s) {
        // Convert the string to a character array for easy modification
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        // Helper function to check if a character is a vowel
//        boolean isVowel(char c) {
//            return "aeiouAEIOU".indexOf(c) != -1;
//        }

        while (left < right) {
            // Move left pointer to the next vowel
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            // Move right pointer to the previous vowel
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            // Swap vowels at left and right pointers
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers closer
            left++;
            right--;
        }

        // Reconstruct the string
        System.out.println(new String(chars));
       // return new String(chars);
    }
public static boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
}
    public static void main(String[] args) {
        String s = "IceCreAm";
        reverseVowels(s);
        //System.out.println(reverseVowels(s)); // Output: "AceCreIm"
    }
}