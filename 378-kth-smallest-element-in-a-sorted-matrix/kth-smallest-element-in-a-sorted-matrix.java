class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                pq.offer(matrix[i][j]);

                if(pq.size()>k){
                    pq.poll(); // remove the largest element
                }

            }
        }
        return pq.peek();
        
    }
}