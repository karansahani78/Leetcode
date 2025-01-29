class Solution {
    public int subarraySum(int[] nums, int k) {
        // bruteforce approach our main goal is to find out start and end of the sub array
    int result =0;
    // for start
    for(int start =0; start<nums.length; start++){
        int currentSum =0;
        for(int end = start; end<nums.length; end++){
            currentSum = currentSum+ nums[end];
            if(currentSum==k){
                result++;
            }

        }

    }
    return result;
        
        
    }
}