class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int original = n*(n+1)/2;
        int currentSum =0;
        for(int i=0; i<nums.length; i++){
            currentSum+=nums[i];
        }
        return original-currentSum;
        
    }
}