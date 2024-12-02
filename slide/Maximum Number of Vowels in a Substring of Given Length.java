class Solution {
    public int maxVowels(String s, int k) {
  
        // Set of vowels for easy checking
        String vowels = "aeiou";
        
        int maxCount = 0, currentCount = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }
        }

        maxCount = currentCount;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            // Remove the effect of the character leaving the window
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currentCount--;
            }
            // Add the effect of the character entering the window
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }

            // Update the maximum count
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        // Example input
        String s = "abciiidef";
        int k = 3;

        // Call the function and print the result
        int result = maxVowels(s, k);
        System.out.println(result); // Output: 3
    }
}

  