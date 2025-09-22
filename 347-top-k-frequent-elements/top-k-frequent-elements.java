class Solution {
    class Number implements Comparable<Number>{
        int element;
        int frequency;
        public Number(int element, int frequency){
            this.element = element;
            this.frequency=frequency;
        }
        // override the method that comparre
        public int compareTo(Number that){
            return that.frequency - this.frequency; // sorted in descending order or decreasing order
        }

    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        PriorityQueue<Number> pq = new PriorityQueue<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        // now put get the element fromt the map with freq and put(offer) them into PriorityQueue
        for(int key:freq.keySet()){
            pq.offer(new Number(key,freq.get(key)));
        }
        // now get the most freqency element from the priorityQueue and add them inside the result array
        int [] result = new int [k];
        for(int i=0; i<k; i++){
            result[i] = pq.poll().element;
        }
        return result;
        
    }
}