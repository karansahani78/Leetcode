import java.util.*;

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        boolean[][] visited = new boolean[n][n];
        
        // Min-heap storing {height, row, col}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;
        
        int maxTime = 0;
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int height = curr[0];
            int r = curr[1];
            int c = curr[2];
            
            // Update max elevation (water level)
            maxTime = Math.max(maxTime, height);
            
            // Reached destination
            if (r == n - 1 && c == n - 1) {
                return maxTime;
            }
            
            // Explore 4-directional neighbors
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    pq.offer(new int[]{grid[nr][nc], nr, nc});
                }
            }
        }
        
        return -1; // unreachable (shouldn’t happen)
    }
}
