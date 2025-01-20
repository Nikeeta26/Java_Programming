class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet to store characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        int left = 0;  // Left pointer of the sliding window
        int maxLength = 0;  // Store the maximum length of substring
        
        for (int right = 0; right < s.length(); right++) {
            // If character at `right` is already in the set, move `left` forward
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));  // Remove character at `left`
                left++;  // Move the left pointer forward
            }
            
            // Add the current character to the set
            set.add(s.charAt(right));
            
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
