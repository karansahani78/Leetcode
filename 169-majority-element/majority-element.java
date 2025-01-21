class Solution {
    public int majorityElement(int[] nums) {
        // bruteForce approach
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}