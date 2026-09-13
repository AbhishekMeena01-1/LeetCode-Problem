class Solution {
    Integer dp[][];
    public int fun(int n, int arr[], int sum){
        if(n==0) return sum==0?1:0;
       if(dp[n][sum]!=null) return dp[n][sum];
       if(arr[n-1]<=sum){
        return dp[n][sum]=fun(n-1,arr,sum-arr[n-1])+fun(n-1,arr,sum);
       }else{
        return dp[n][sum]=fun(n-1,arr,sum);
       }
    }
    public int fun_dp(int n, int arr[], int sum){
        dp=new Integer[n+1][sum+1];
        for(int i=0;i<=sum;i++){
            dp[0][i]=0;
        }
        dp[0][0]=1;
        return fun(n,arr,sum);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        target = Math.abs(target);
        for(int n:nums) sum+=n;
        if(target>sum ||(sum+target)%2==1)return 0;
return fun_dp(nums.length,nums,(sum+target)/2);
    }
}