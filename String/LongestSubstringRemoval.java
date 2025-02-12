public class LongestSubstringRemoval {
    // Function to find and remove the longest repeating substring
    public static String removeLongestRepeatingSubstring(String str) {
        String longestSubstring = findLongestRepeatingSubstring(str);
        if (!longestSubstring.isEmpty()) {
            return str.replaceFirst(longestSubstring, "");
        }
        return str;
    }

    // Function to find the longest repeating substring
    private static String findLongestRepeatingSubstring(String str) {
        int n = str.length();
        String longest = "";
        
        // Iterate through all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);
                
                // Check if it appears again in the string
                if (str.indexOf(sub, i + 1) != -1 && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String input = "abcabcde";
        String result = removeLongestRepeatingSubstring(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
}
