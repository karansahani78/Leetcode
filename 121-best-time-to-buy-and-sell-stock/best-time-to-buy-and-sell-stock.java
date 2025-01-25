class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null && prices.length==0){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int maxP =0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
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