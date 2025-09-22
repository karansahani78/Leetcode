class Solution {
    class MyChar implements Comparable<MyChar>{
        char character;
        int frequency;
        public MyChar(char character, int frequency){
            this.character=character;
            this.frequency = frequency;
        }
        // override compareTo method
        public int compareTo(MyChar that){
            return that.frequency - this.frequency; // sorted in descending order
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer>freq = new HashMap<>();
        PriorityQueue<MyChar>pq = new PriorityQueue<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        
        }
        // now get the key value pair from map and offer it into queue
        for(char key : freq.keySet()){
            pq.offer(new MyChar(key,freq.get(key)));
        }
        // now make a new string to hold the result 
        StringBuilder result = new StringBuilder();
        while(!pq.isEmpty()){
            MyChar topChar = pq.poll();
            for(int i=0; i<topChar.frequency; i++){
                result.append(topChar.character);
            }
        }
        return result.toString();
        
    }
}