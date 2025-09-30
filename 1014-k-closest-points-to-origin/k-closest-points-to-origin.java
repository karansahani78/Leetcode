class Solution {
    static class Closest implements Comparable<Closest>{
        int index;
        int distance;
        public Closest(int index, int distance){
            this.index=index;
            this.distance=distance;
        }
        public int compareTo(Closest that){
            if(this.distance==that.distance){
                return this.index-that.index;
            }
            return this.distance-that.distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Closest>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<points.length; i++){
            int x = points[i][0];
            int y = points[i][1];
            int distance = x * x + y * y;
            pq.offer(new Closest(i,distance));

            if(pq.size()>k){
                pq.poll();
            }
        }
        int ans[][] = new int[k][2];
        for(int i=0; i<k; i++){
            Closest cPoint = pq.poll();
            ans[i]=points[cPoint.index];
        }
        return ans;

        
    }
}