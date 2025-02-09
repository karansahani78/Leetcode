class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        // Start Kadane-style processing from each index
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            // Expand the subarray starting from `i`
            for (int j = i; j < nums.length; j++) {
                sum += nums[j]; // Extend the subarray by adding nums[j]

                // Check if this subarray sums to k
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
