class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0 || prices==null){
            return 0;
        }
        int min= Integer.MAX_VALUE;
        int maxp = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int profit = prices[i]-min;
            if(profit>maxp){
                maxp = profit;
            }
        }
        return maxp;
        
    }
}