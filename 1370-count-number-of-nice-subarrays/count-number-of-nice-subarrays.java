class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int result =0;
        int oddCount =0;
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                oddCount++;
            }
            // checking if ps-k how many time present inside the map
           result+=map.getOrDefault(oddCount-k,0);
           // update the map
           map.put(oddCount,map.getOrDefault(oddCount,0)+1);
        }
        return result;
        
    }
}