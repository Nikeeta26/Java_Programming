import java.util.*;

public class CloseStrings {
    public static boolean closeStrings(String word1, String word2) {
        // Step 1: Check if lengths match
        if (word1.length() != word2.length()) {
            return false;
        }

        // Step 2: Check if both strings have the same unique characters
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (char c : word1.toCharArray()) {
            set1.add(c);
        }
        for (char c : word2.toCharArray()) {
            set2.add(c);
        }
        if (!set1.equals(set2)) {
            return false;
        }

        // Step 3: Check if character frequencies match
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(closeStrings("abc", "bca")); // true
        System.out.println(closeStrings("a", "aa"));   // false
        System.out.println(closeStrings("cabbba", "abbccc")); // true
    }
}
