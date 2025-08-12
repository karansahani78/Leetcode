class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int island=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == '1'){
                    island++;
                    // now we have to  remove the visited island
                    remove(grid, i,j);
                }
            }
        }
            return island;
        }
        // helper method to remove the already visited island 
        private void remove(char [][] grid, int i, int j){
            int row = grid.length;
            int col = grid[0].length;
            if(i<0 || j<0 || i>=row || j>=col || grid[i][j]=='0'){
                return;
            }
              grid[i][j] = '0'; // we marked is visited
            remove(grid,i-1, j); // remove up side
            remove(grid, i+1, j); // remove down
            remove(grid, i, j-1); // remove left side
            remove(grid, i, j+1); // remove right side


        }
        
    }