class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product =1;
        int start =0;
        int count =0;
        for(int end=start; end<nums.length; end++){
            product = product*nums[end];
            while(product>=k && start<=end){
                product = product/nums[start];
                start++;
            }
            // valid window count
            count = count+(end-start+1);
        }
        return count;
        
    }
}