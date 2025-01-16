class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int x =0; // store current streak of 1
        int y = 0; // store maximum streak of 1
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                x++;
                if(x>y){
                    y=x; // update the maximum 
                }
            }
            else{
                x=0; // if 0 found then reset the current streak to 0
            }
        }
        return y;
        
    }
}