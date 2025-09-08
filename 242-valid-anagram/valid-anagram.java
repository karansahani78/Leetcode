class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int [] frequency = new int [256];
        
        for(int i=0; i<t.length(); i++){
            frequency[t.charAt(i)]++;

        }
        for(int i=0; i<s.length(); i++){
            frequency[s.charAt(i)]--;
        }
        for(int i=0; i<256; i++){
            if(frequency[i]!=0) return false;
        }
        return true;
        
    }
}