class Solution {
    public int maxProduct(int n){
        int f=0;
        int s=0;
        while(n>0){
            int di=n%10;
            if(di>f){
                s=f;
                f=di;
            }else if(di>s){
                s=di;
            }
            n/=10;

            }
            return f*s;
        }
}