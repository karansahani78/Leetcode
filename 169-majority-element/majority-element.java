class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;  // To track "votes" for the current candidate
        int max = 0;    // To store the current candidate
        
        // First pass to find the majority candidate
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                max = nums[i];  // If count is 0, reset the candidate to the current number
            }
            if (nums[i] == max) {
                count++;  // Increment count if current number matches candidate
            } else {
                count--;  // Decrement count if it doesn't match
            }
        }
        
        return max;  // Return the final candidate, which is guaranteed to be the majority element
    }
}
