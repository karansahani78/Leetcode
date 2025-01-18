class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentConse = 0;
        int maxCons=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                currentConse++;
            } else {
                currentConse=0;
            }
            if(currentConse>maxCons){
                maxCons=currentConse;
            }
        }
        return maxCons;
        
    }
}