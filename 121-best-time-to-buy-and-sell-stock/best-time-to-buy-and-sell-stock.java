class Solution {
    public int maxProfit(int[] prices) {
        // edge case
        if(prices.length==0 || prices==null){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        int maxP = 0;
        for(int i=0; i<prices.length; i++){
            if(min>prices[i]){
                min = prices[i];
            }
            int profit = prices[i]-min;
            if(profit>maxP){
                maxP = profit;
            }
        }
        return maxP;
        
    }
}