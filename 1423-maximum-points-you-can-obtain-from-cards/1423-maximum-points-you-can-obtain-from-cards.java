class Solution {
    public int maxScore(int[] arr, int k) {
        int lSum=0,rSum=0,maxSum=0;
        for(int i=0;i<k;i++){
            lSum+=arr[i];

        }
        maxSum=lSum;
        int i=k-1;
        int j=arr.length-1;
        while(i>=0){
            lSum-=arr[i];
            i--;
            rSum+=arr[j];
            j--;
            maxSum=Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }
}