class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        // Step 1: Square all numbers
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] * nums[i];
        }

        // Step 2: Sort using two-pointer swap logic
        int left = 0;
        int right = 1;

        while (right < ans.length) {
            if (ans[left] > ans[right]) {
                // swap
                int temp = ans[left];
                ans[left] = ans[right];
                ans[right] = temp;

                // move one step back if possible
                if (left > 0) {
                    left--;
                    right--;
                    continue;
                }
            }

            // ✅ move forward whether swapped or not
            left++;
            right++;
        }

        return ans;
    }
}
