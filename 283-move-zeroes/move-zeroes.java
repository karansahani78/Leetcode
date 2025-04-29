class Solution {
    public void moveZeroes(int[] nums) {
        int nonZ =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[nonZ] =nums[i]; 
            if(i!=nonZ){
                nums[i]=0;
            }
            nonZ++;
        }

        
    }
    }
}