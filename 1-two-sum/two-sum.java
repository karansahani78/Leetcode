class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int unknownElement = target-nums[i];

            if(map.containsKey(unknownElement)){
                return new int[]{map.get(unknownElement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    
        
    }
}