class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int max = nums[0];
        for(int num:nums){
            count.put(num, count.getOrDefault(num,0)+1);
            if(count.get(num)>count.get(max)){
                max = num;
            }
        }
        return max;       
        
    }
}