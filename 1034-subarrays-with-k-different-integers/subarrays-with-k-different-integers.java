class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countOfSubarrayWithAtMost(nums,k)-countOfSubarrayWithAtMost(nums,k-1);
        
    }
    public int countOfSubarrayWithAtMost(int [] nums, int k){
        int start=0;
        int end =0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(end<nums.length){
            // adding element to the map
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            // shrink the window if already present then remove the count and we know added above so -1
            while(map.size()>k){
                map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start])==0){
                    map.remove(nums[start]);
                }
                start++;
            }
            count = count+(end-start+1);
            end++;
        }
        return count;
        
    }
}