class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;   
    }
    s = s.toLowerCase();
    int  start =0;
    int end = s.length()-1;
    while(start<=end){
        while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
            start++;
        } while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
            end--;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
}
}