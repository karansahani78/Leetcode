class Solution {
    public int singleNumber(int[] nums) {
     // We use XOR here because XOR cancels out duplicate numbers, leaving only the unique number.
     int result =0;
     for(int i=0; i<nums.length; i++){
        result^=nums[i];
     }
     return result;
 
        
    }
}