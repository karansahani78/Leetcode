class Solution {
    public int subarraySum(int[] nums, int k) {
        int result =0;
        int ps =0;
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            ps+= nums[i];
            result+=map.getOrDefault(ps-k,0);
            // update the map
            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        return result;
    }

}