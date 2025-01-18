class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentConse =0;
        int maxConse =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                currentConse++;
            } else {
                currentConse=0; // reset currentConse if found 0
            }
            if(currentConse>maxConse){
                maxConse = currentConse;
            }
        }
        return maxConse;
        
    }
}