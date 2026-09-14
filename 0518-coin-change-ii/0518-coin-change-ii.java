class Solution {
    public int fun(int amount, int []coins,int n,Integer [][]dp){
       // if(n==0 || amount ==0)return 0;
        if(dp[n][amount]!=null)return dp[n][amount];
        if(coins[n-1]<=amount){
            return dp[n][amount]=fun(amount-coins[n-1],coins,n,dp)+
            fun(amount, coins,n-1,dp);
        }
        return dp[n][amount]= fun(amount, coins,n-1,dp);
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        Integer dp[][]=new Integer[n+1][amount+1];
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=0;
        }
         for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
    
return fun(amount,coins,n,dp);
    }
}