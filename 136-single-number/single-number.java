class Solution {
    public int singleNumber(int[] nums) {
        // brute force approach
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                // Compare nums[i] with other elements in the array
                if (i != j && nums[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            // If the element is not found in the rest of the array, return it
            if (!found) {
                return nums[i];
            }
        }
        return -1;  // In case no result is found, though it shouldn't happen according to problem constraints
    }
}
