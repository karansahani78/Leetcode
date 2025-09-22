class Solution {
    class Word implements Comparable<Word>{
        String words;
        int frequency;
        public Word(String words, int frequency){
            this.words = words;
            this.frequency = frequency;
        }
        public int compareTo(Word that){
            if(this.frequency != that.frequency)
                return that.frequency - this.frequency; // descending freq
            return this.words.compareTo(that.words);      // ascending alphabet
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> freq = new HashMap<>();
        List<String> result = new ArrayList<>();
        PriorityQueue<Word> pq = new PriorityQueue<>();
        for(String word : words){
            freq.put(word,freq.getOrDefault(word,0)+1);
    
        }
        for(String word:freq.keySet()){
            pq.offer(new Word(word,freq.get(word)));
        }
        // now traverse the k length and put the result in our result array
        for(int i=0; i<k; i++){
            result.add(pq.poll().words);
        }
        return result;
        
        
        
    }
}