class Solution {
    public int fib(int n) {
        int [] dp = new int[n+1];
        if(n<=1) return n;
        // if already computed
        if(dp[n]!=0) return dp[n];  // reuse stored result
        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];





        
    }
}