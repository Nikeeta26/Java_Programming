package nikeeta;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0]; // Initialize the prefix with the first string

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // While the prefix is not a prefix of strs[i]
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix
                if (prefix.isEmpty()) return ""; // If prefix is empty, return ""
            }
        }
        
        return prefix; // Return the longest common prefix
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}

