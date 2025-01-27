class Solution {
    public int maxArea(int[] height) {
        int left = 0;                    // Start pointer
        int right = height.length - 1;   // End pointer
        int maxWater = 0;                // To store the maximum water

        while (left < right) {
            // Calculate the height of the smaller line
            int minHeight;
            if (height[left] < height[right]) {
                minHeight = height[left];
            } else {
                minHeight = height[right];
            }

            // Calculate the current water
            int water = minHeight * (right - left);

            // Update the maximum water if current is greater
            if (water > maxWater) {
                maxWater = water;
            }

            // Move the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater; // Return the maximum water found
    }
}
