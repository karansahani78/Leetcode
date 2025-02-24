class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>map = new HashMap<>();
        map.merge(0,1,Integer::sum);
        int count=0;
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];

            if(map.containsKey(sum-goal)){
                count+=map.get(sum-goal);
            }
            map.merge(sum,1,Integer::sum);
        
        }
        return count;
        
    }
}