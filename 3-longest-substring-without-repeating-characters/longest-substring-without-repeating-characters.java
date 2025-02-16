import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int start = 0;
        int maxLength = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char currentCharacter = s.charAt(end);

            // Try to add the character, if false, remove from start until it succeeds
            while (!seen.add(currentCharacter)) {
                seen.remove(s.charAt(start));
                start++; // Shrink the window
            }

            // Update max length after adding
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
