class Solution {
    public int maxSubArray(int[] nums) {
         int max =nums[0];
        int currentMax =0;
        for(int i=0; i<nums.length; i++){
            currentMax=currentMax+nums[i];
            if(currentMax>max){
                max = currentMax;
            }
            if(currentMax<0){
                currentMax=0;
            }
        }
        return max;
    }
}