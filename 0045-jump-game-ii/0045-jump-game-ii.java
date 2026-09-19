class Solution {
   
    public int fun(int i,int n,int[] nums,Integer dp[]){
        if(i>=n-1)return 0;
        if(dp[i]!=null)return dp[i];
        int ans=Integer.MAX_VALUE;
        for(int j=i+1;j<=i+nums[i] && j<n;j++){
            int res=fun(j,n,nums,dp);
          
            if (res != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + res);
            }
        }

        return dp[i] = ans;
    }
    public int jump(int[] nums) {
        int n=nums.length;
      Integer dp[] = new Integer[n];
      return fun(0,n,nums,dp);
    }
}