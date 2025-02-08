class Solution {
    public int lengthOfLongestSubstring(String s) {
      int maxLength = 0;  // Start with 0 as initial maximum length
        int start = 0;  // Start pointer for sliding window
        if(s==null || s.isEmpty()){
            return 0;
        }

        // Using HashSet to store unique characters in the current window
        HashSet<Character> seen = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            // Get the current character in the string
            char currentChar = s.charAt(end);

            // If the character is already in the set, shrink the window from the left
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(start));  // Remove character at start
                start++;  // Move the start pointer forward
            }

            // Add the current character to the HashSet
            seen.add(currentChar);

            // Calculate the length of the current window
            int currentLength = end - start + 1;

            // Update maxLength without using Math.max
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;  // Return the maximum length of the substring
    }
}
