class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int start = 0;
        int count = 0;
        int oddCount = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] % 2 != 0) {
                oddCount++;
            }

            while (oddCount > k && start <= end) {
                if (nums[start] % 2 != 0) {
                    oddCount--;
                }
                start++;
            }

            int tempStart = start;
            int tempOddCount = oddCount;

            while (tempOddCount == k && tempStart <= end) {
                count++;
                if (nums[tempStart] % 2 != 0) {
                    tempOddCount--;  
                }
                tempStart++;  // Move tempStart to avoid infinite loop
            }
        }
        
        return count;  // Return the correct result
    }
}
