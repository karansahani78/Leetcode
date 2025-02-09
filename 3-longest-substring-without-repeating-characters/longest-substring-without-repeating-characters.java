class Solution {
    public int lengthOfLongestSubstring(String s) {
     if(s==null || s.isEmpty()){
            return 0;
        }
        int start =0;
        int maxLength= Integer.MIN_VALUE;
        /*
        generate all the substring
        then create hashset to check duplicacy
        then get current Character
        if hshset contains current character then remove the currentCharacter
        and shring the window by push start one step ahead start++
        then come out the loop and add current character back to seen to be sure that it is unique and not repeated
        then get currentLength
         */
        HashSet<Character> seen = new HashSet<>();
        for(int end = start; end<s.length(); end++){
            char currentCharacter = s.charAt(end);
            while(seen.contains(currentCharacter)){
                seen.remove(s.charAt(start));
                // shrink the window
                start++;
            }
            seen.add(currentCharacter);
            int currentLength = end - start+1;
            if(currentLength>maxLength){
                maxLength = currentLength;
            }


        }
        return maxLength;
    }
    }

