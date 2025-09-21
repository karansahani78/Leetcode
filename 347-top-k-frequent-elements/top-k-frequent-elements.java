class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        // now create a array for the result having k size
        int [] result = new int[k];
        // now lets check which element is more freq count and we will do this k times
        for(int i=0; i<k; i++){
            int maxFreq =-1;
            int maxFnumber= -1; // this is the number that has maximum freq
              // find the element with the highest frequency
              for(int number :freq.keySet()){
                if(freq.get(number)>maxFreq){
                    maxFreq = freq.get(number);
                    maxFnumber =number;
                }
              }
              result[i]=maxFnumber;
              freq.remove(maxFnumber);
        }
        return result;
        
    }
}