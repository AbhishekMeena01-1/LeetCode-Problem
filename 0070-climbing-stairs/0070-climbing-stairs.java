class Solution {
    public int climbStairs(int n) {
         Integer dp[]=new Integer[n+1];
         return climbing(n,dp);
    }
    static int climbing(int n, Integer dp[]){
        if(n<=3)return n;
        if(dp[n]!=null)return dp[n];
        return dp[n]=climbing(n-1,dp)+climbing(n-2,dp);
    }

}