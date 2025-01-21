class Solution {
    public int singleNumber(int[] nums) {
        // optimal approach
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])){ // adding element to set and if already set has that element then it failed to add and remove that element
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();
        
    }
}