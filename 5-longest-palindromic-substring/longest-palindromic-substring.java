class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.isEmpty()) return "";
        // first let generate all the substrings
        String longestPalindromicSubstring = "";
        int longestLength= Integer.MIN_VALUE;
        for(int start=0; start<s.length(); start++){
            for(int end = start; end<=s.length(); end++){
                String subStrings = s.substring(start,end);
                if(isPalindrom(subStrings) && subStrings.length()>longestLength){
                    longestPalindromicSubstring= subStrings;
                    longestLength = subStrings.length();

                }
            }
        }
        return longestPalindromicSubstring;
}
// helper method to find out the palindrom 
public boolean isPalindrom(String str){
    int left =0;
    int right =str.length()-1;
    while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;

}
}