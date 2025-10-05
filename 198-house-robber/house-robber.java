class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
          int [] dp = new int[n];
        if(n==0) return 0;
        if(n==1) return nums[0];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2; i<n; i++){
            int loot = nums[i]+dp[i-2]; // Loot current house → add its money + best till i-2
            int skip =dp[i-1]; // skip the current house
            dp[i]= Math.max(loot, skip);
        }
        return dp[n-1];
        
    }
}