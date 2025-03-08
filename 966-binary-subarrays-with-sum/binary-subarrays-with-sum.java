class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return numSubarrayWithAtMost(nums,goal)-numSubarrayWithAtMost(nums,goal-1);
    }
    public int numSubarrayWithAtMost(int []nums,int goal){
        int sum=0;
        int start=0;
        int count=0;
        for(int end = start; end<nums.length; end++){
            // expansion phase
            sum= sum+nums[end];
            while(sum>goal && start<=end){
                sum= sum-nums[start];
                start++;
            }
            // valid subarray count
            count = count + (end-start+1);
        }
        return count;
    }
}