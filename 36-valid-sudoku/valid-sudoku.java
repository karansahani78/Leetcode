class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check row 
        for(int row=0; row<9; row++){
            HashSet<Character>seen = new HashSet<>();
            for(int col=0; col<9; col++){
                char num = board[row][col];
                if(num=='.') continue;
                if(seen.contains(num)) return false;
                seen.add(num);
            }
        }
        // check col
        for(int col=0; col<9; col++){
            HashSet<Character> seen = new HashSet<>();
            for(int row=0; row<9; row++){
                char num = board[row][col];
                if(num=='.') continue;
                if(seen.contains(num)) return false;
                seen.add(num);
        }
        }

        // now check the each boxes
        for(int boxRow=0; boxRow<9; boxRow+=3){
            for(int boxCol=0; boxCol<9; boxCol+=3){
                HashSet<Character> seen = new HashSet<>();
                // now each row and col of the each box
                for(int row=0; row<3; row++){
                    for(int col=0; col<3; col++){
                        char num = board[boxRow+row][boxCol+col];
                        if(num=='.') continue;
                        if(seen.contains(num)) return false;
                        seen.add(num);
                    }
                }
            }

        }
        return true;
        
    }
}