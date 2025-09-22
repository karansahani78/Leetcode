import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int num : nums) {
            pq.offer(num);  // add element
            if (pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }
        
        // top of heap is kth largest
        return pq.peek();
    }
}
