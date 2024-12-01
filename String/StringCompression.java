class Solution {
    public int compress(char[] chars) {
        int write = 0; // Pointer for writing compressed characters
        int read = 0;  // Pointer for reading characters

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Step 1: Count the number of consecutive repeating characters
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Step 2: Write the character
            chars[write++] = currentChar;

            // Step 3: If count > 1, write the count as digits
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
