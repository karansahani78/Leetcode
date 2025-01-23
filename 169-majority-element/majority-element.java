class Solution {
    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0; // Reset count for each candidate
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            // Check if the count of the current candidate is greater than n/2
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return -1; // Return -1 if no majority element is found
    }
}