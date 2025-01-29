import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> unique = new HashSet<>();
        
        // Sort the array to help with skipping duplicates
        Arrays.sort(nums);

        // Outer loop for i
        for (int i = 0; i < nums.length; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Inner loop for j
            for (int j = i + 1; j < nums.length; j++) {
                // Skip duplicates for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                Set<Long> seen = new HashSet<>();
                
                // Inner loop for k
                for (int k = j + 1; k < nums.length; k++) {
                    long complement = (long) target - (long) nums[i] - (long) nums[j] - (long) nums[k];
                    // Check if the complement is in the seen set
                    if (seen.contains(complement)) {
                        List<Integer> quadruplets = Arrays.asList(nums[i], nums[j], nums[k], (int) complement);
                        Collections.sort(quadruplets);
                        unique.add(quadruplets);
                    }
                    // Add current value to seen set
                    seen.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(unique);
    }
}
