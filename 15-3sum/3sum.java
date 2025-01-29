class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // optimal solution for this 
        // creating hashset to store unique element only
       Set<List<Integer>>unique = new HashSet<>();
       for(int i=0; i<nums.length; i++){
        // creating hashset to check if element already present or not 
        Set<Integer> seen = new HashSet<>();
        for(int j=i+1;  j<nums.length; j++){
            // int k = -1+1=0 so that third element is 0 thats why doing -
            int complement = -(nums[i]+nums[j]);
            if(seen.contains(complement)){
                // creating a list to store the triplet
                List<Integer> triplets = Arrays.asList(nums[i],nums[j],complement);
                // sorting to reduce duplicacy 
                Collections.sort(triplets);
                // adding to the hashset
                unique.add(triplets);
            }
            // for next iteration adding nums[j] to the seen to tell the program that we allready got j
            seen.add(nums[j]);
            
        }
       }
        // returning the hashset as list
       return new ArrayList<>(unique);
    
        
    }
}