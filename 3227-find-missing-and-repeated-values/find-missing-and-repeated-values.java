import java.util.HashSet;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int mN = -1; // Missing Number
        int rN = -1; // Repeated Number
        int n = grid.length; // Size of the grid
        int totalSize = n * n; // Total numbers expected
        HashSet<Integer> set = new HashSet<>();

        // Loop through the grid to find the repeated number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                if (set.contains(num)) {
                    rN = num; // Found the repeated number
                } else {
                    set.add(num); // Add the number to the set
                }
            }
        }

        // Loop to find the missing number
        for (int i = 1; i <= totalSize; i++) {
            if (!set.contains(i)) {
                mN = i; // Found the missing number
                break; // Exit the loop after finding the first missing number
            }
        }

        return new int[]{rN, mN}; // Return the repeated and missing numbers
    }
}