class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return ""; // strs ["flower","flow","flight"]  j ==flight"]
        
        String prefix = "";
        for(int i=0; i<strs[0].length(); i++){ // i =0; i =f j=f  if pref = "fl"
                                                  // i=1 i=l j=1; j =l
                                                // i=2 i=i j=2 o i!j  return previouse prefix 

            char currentCharacter = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=currentCharacter){
                    return prefix;
                }
            }
            prefix+=currentCharacter;

        }
        return prefix;
        
    }
}