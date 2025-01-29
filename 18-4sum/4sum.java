class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> unique = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Set<Long> seen = new HashSet<>();
                for (int k = j + 1; k < nums.length; k++) {
                    long complement = (long) target - (long) nums[i] - (long) nums[j] - (long) nums[k];
                    if (seen.contains(complement)) {
                        List<Integer> quadruplets = Arrays.asList(nums[i], nums[j], nums[k], (int) complement);
                        Collections.sort(quadruplets);
                        unique.add(quadruplets);
                    }
                    seen.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(unique);
    }
}
