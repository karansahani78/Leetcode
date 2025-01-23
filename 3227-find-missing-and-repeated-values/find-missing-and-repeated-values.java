class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int rN = -1;
        int totalNumber = n*n;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int num = grid[i][j];
                if(set.contains(num)){
                    rN = num;
                } else {
                    set.add(num);
                }
            }
        }
        int mN = -1;
        for(int i=1; i<=totalNumber; i++){
            if(!set.contains(i)){
                mN =i;
                break;
            }
        }
        return new int[]{rN,mN};
        
    }
}