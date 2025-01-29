class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentMax =0;
        for(int i=0; i<nums.length; i++){
            currentMax=currentMax+nums[i];
            if(currentMax>max){
                max = currentMax;
            }
            // if fount 0 reset the current Max 0
            if(currentMax<0){
                currentMax=0;
            }
        }
        return max;
        
    }
}