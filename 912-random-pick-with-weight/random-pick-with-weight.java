class Solution {
    int maxWeight =0;
    TreeMap<Integer,Integer> map = new TreeMap<>();
    Random random = new Random();
    
    public Solution(int[] w) {
        for(int i=0; i<w.length; i++){
            maxWeight+=w[i];
            map.put(maxWeight,i);
        }
        
    }
    
    public int pickIndex() {
        int key =map.higherKey(random.nextInt(maxWeight));
        return map.get(key);
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */