class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String currentS = strs[i];
            char [] arrS = currentS.toCharArray();
            Arrays.sort(arrS);

        // sorted String
        String sortedStr = new String(arrS);
        if(!map.containsKey(sortedStr)){
            map.put(sortedStr, new ArrayList<>());
            
        }
         // Add original string to the list corresponding to the sorted key
         map.get(sortedStr).add(currentS);
        
    
    }
      // Collect all grouped anagrams into the result list
      return new ArrayList<>(map.values());
}
}