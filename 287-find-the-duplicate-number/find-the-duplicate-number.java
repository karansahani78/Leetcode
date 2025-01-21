class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(seen.contains(nums[i])){
                return nums[i]; // duplicate found
            } else {
                seen.add(nums[i]); // if not then add this element
            }
        }
        return -1; // if no duplicate found
        
    }
}