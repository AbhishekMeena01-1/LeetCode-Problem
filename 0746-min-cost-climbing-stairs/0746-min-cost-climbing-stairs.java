class Solution {
    public static int solve(int i,int[] cost, Integer dp[]){
            if(i<=1)return 0;
        if(dp[i]!=null)return dp[i];
        dp[i]=Math.min(solve(i-1,cost,dp)+cost[i-1],
                  solve(i-2,cost,dp)+cost[i-2]);

        return dp[i];
           }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        Integer dp[]= new Integer[n+1];
        return solve(n,cost,dp);
    }
}