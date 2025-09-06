class Solution {
    public int countSubstrings(String s) {
        if(s==null || s.isEmpty()) return 0;
        int pSCount =0;
        int start=0;
        int end =0;
        for(start =0; start<s.length(); start++){
             for(end =start+1; end<=s.length(); end++){
                String substrings = s.substring(start,end);
                if(isPalindrome(substrings)){
                    pSCount++;
                }
            }
        }
        return pSCount;
        
    }
    public boolean isPalindrome(String str){
        int left=0;
        int right = str.length()-1;
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