class Solution {
    public int fun(String s1, String s2, int m, int n, Integer dp[][]){
        if(m==0 || n==0)return 0;
        if(dp[m][n]!=null)return dp[m][n];
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return dp[m][n]= 1+fun(s1,s2,m-1,n-1,dp);

        }
        else{
            return dp[m][n]=Math.max(fun(s1,s2,m-1,n,dp),
            fun(s1,s2,m,n-1,dp));
        }
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        Integer dp[][]=new Integer[m+1][n+1];
       return fun(s1,s2,m,n,dp);
    }
}