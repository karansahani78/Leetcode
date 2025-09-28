class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            pq.offer(stone);
        }
        while(pq.size()>1){
            int y = pq.poll(); // max 
            int x = pq.poll();  // second max
            if(y!=x){
                pq.offer(y-x);  // put difference back

            }
        }
         // If no stone left, return 0
         return pq.isEmpty() ? 0:pq.peek();
        
    }
}