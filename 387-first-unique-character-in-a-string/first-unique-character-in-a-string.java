class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char e = s.charAt(i);
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int i=0; i<s.length(); i++){
            char cE = s.charAt(i);
            if(map.get(cE)==1){
                return i;
            }
        }
        return -1;
        
    }
}