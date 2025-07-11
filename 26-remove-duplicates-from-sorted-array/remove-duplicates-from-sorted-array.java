class Solution {
    public int removeDuplicates(int[] nums) {
        int left =0;
        for(int right=0; right<nums.length; right++){
            if(nums[left]!=nums[right]){
                nums[left+1]=nums[right];
                left++;
            }
        }
        return left+1;
        
    }
}