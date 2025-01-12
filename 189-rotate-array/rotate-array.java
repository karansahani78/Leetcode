class Solution {
    public void rotate(int[] nums, int k) {
         k = k % nums.length; 
        // step:1 reverse entire nums
        reverse(nums,0,nums.length-1);
        // Step 2: Reverse from 0 to k-1
        reverse(nums,0,k-1);
         // Step 3: Reverse from k to nums.length-1
         reverse(nums,k,nums.length-1);

        
    }
    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
}