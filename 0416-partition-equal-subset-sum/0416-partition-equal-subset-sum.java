class Solution {
    Boolean dp[][];
    public boolean part(int n,int arr[],int sum){
        if(sum==0)return true;
        if(n==0)return false;
        if(dp[n][sum]!=null)return dp[n][sum];
        if(arr[n-1]<=sum){
            return dp[n][sum]=part(n-1,arr,sum-arr[n-1])|| part(n-1,arr, sum);
         }else{
            return dp[n][sum]= part(n-1,arr, sum);
         }
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
            if(sum%2!=0){
                return false;
            }
                sum=sum/2;
               dp=new Boolean[n+1][sum+1];
                // for(int i=0;i<=sum;i++){
                //     dp[0][i]=false;

                // }
                // for(int i=0;i<=n;i++){
                //     dp[i][0]=true;

            //     }
            
        
        return part(n,nums,sum);
    }
}