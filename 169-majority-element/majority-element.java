class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int maj =0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                maj = nums[i];
            } if(nums[i]==maj){ // if duplicate found than increase otherwise decrease count
                count++;
            } else{
                count--;
            }
        }
        return maj;
        
    }
}