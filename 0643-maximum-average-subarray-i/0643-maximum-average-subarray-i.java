class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int i=0,j=0,sum=0;
        double avg=Double.NEGATIVE_INFINITY;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1<k)j++;
            else{
                avg=Math.max(avg,(double) sum/k);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        return avg;
    }
}