class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character>sM = new HashMap<>();
         Map<Character,Character>tM = new HashMap<>();
         
         for(int i=0; i<s.length(); i++){
            char sC = s.charAt(i);
            char tC = t.charAt(i);

            if(sM.containsKey(sC) && sM.get(sC)!=tC){
                return false;
            }
             if(tM.containsKey(tC) && tM.get(tC)!=sC){
                return false;
         }
         sM.put(sC,tC);
         tM.put(tC,sC);
        
    }
    return true;
}
}