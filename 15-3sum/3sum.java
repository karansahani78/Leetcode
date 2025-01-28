import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        
        for (int i = 0; i < nums.length - 1; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -(nums[i] + nums[j]);
                
                // If the complement exists in the set, we've found a triplet
                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet);  // Sort the triplet to ensure uniqueness
                    resultSet.add(triplet);
                }
                seen.add(nums[j]);  // Add the current number to the set
            }
        }

        // Convert HashSet to List for the final result
        return new ArrayList<>(resultSet);
    }
}
