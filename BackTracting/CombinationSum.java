import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result; // Return empty list for empty input
        }

        String[] digitToChar = {
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
        };

        backtrack(result, new StringBuilder(), digits, 0, digitToChar);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder combination, String digits, int index, String[] digitToChar) {
        // Base case: If the combination length matches the input length, add to result
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }

        // Get the corresponding characters for the current digit
        String possibleChars = digitToChar[digits.charAt(index) - '0'];

        // Iterate over these characters
        for (char c : possibleChars.toCharArray()) {
            combination.append(c);                 // Choose
            backtrack(result, combination, digits, index + 1, digitToChar); // Explore
            combination.deleteCharAt(combination.length() - 1); // Un-choose
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23")); // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
        System.out.println(solution.letterCombinations(""));   // Output: []
        System.out.println(solution.letterCombinations("2"));  // Output: [a, b, c]
    }
}
