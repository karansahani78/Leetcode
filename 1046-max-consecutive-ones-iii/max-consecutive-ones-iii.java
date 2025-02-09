class Solution {
    public int longestOnes(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        int zeroCount = 0;

        for (int end = start; end < nums.length; end++) {
            if (nums[end] == 0) {
                zeroCount++;
            }

            // Shrink the window if zeroCount exceeds k
            if (zeroCount > k) {
                if (nums[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            // Update the maxLength with the current window size
            int currentLength = end - start + 1;
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
