class Solution {
    // custom sorting using compareTo
    static class Row implements Comparable<Row>{
        int index;
        int numberOfSoldiers;
        public Row(int index,int numberOfSoldiers){
            this. index = index;
            this.numberOfSoldiers = numberOfSoldiers;
        }
        public int compareTo(Row that){
            if(this.numberOfSoldiers == that.numberOfSoldiers){
               return this.index - that.index; // smaller index first
            }
            return this.numberOfSoldiers-that.numberOfSoldiers;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length; // row 
        int [] ans = new int[k];
        List<Row> row = new ArrayList<>();
        // Step 1: count soldiers in each row
        for(int i=0; i<m; i++){
            int numberOfSoldiers=0;
            for(int soldier : mat[i]){
                numberOfSoldiers+=soldier;
            }
            row.add(new Row(i,numberOfSoldiers));
        }
        // sort the row using owr custom rule
        Collections.sort(row);
        for(int i=0; i<k; i++){
            ans[i] = row.get(i).index;
        }
        return ans;
        
    }
}