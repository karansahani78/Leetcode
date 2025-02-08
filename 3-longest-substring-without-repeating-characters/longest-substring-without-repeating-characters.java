class Solution {
    public int lengthOfLongestSubstring(String s) {
         if (s == null || s.isEmpty()) {
            return 0;  // Directly return 0 for empty string
        }
        int maxLength = Integer.MIN_VALUE;
        for(int start =0; start<s.length(); start++){
            // creating hashset to check duplicacy
            HashSet<Character> seen = new HashSet<>();
            // generating all the substrings
            for(int end= start; end<s.length(); end++){
                // getting the current character in substring 
                char currentCharacter = s.charAt(end);
                // adding to the hashset if add failed it means already has this value then break
                if(!seen.add(currentCharacter)){
                    break;
                }
                // currentLength of the unique substring 
                int currentLength= end-start+1;
                if(currentLength>maxLength){
                    maxLength= currentLength;
                }

            }
        }
        return maxLength;
        
    }
}