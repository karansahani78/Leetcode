class Solution {
    public int characterReplacement(String s, int k) {
    int start = 0;
        int maxLength = 0;
        int maxCount =0;

        HashMap<Character,Integer> count = new HashMap<>();
        for(int end = start; end<s.length(); end++){
            char characterAtEnd = s.charAt(end);
            count.merge(characterAtEnd,1,Integer::sum);
           maxCount = Math.max(maxCount,count.get(characterAtEnd)); //how many times the character endChar has appeared in the current window.
            while((end-start+1)-maxCount>k){
                char currentCharacterAtStart = s.charAt(start);
                count.merge(currentCharacterAtStart,-1,Integer::sum);
                start++;

                }
            maxLength = Math.max(maxLength,end-start+1);
            }
        return maxLength;

        }
    }
