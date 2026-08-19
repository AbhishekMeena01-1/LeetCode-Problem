class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        solve(ans,curr,k,n,1);
        return ans;

    }
    public void solve(List<List<Integer>>ans, List<Integer>curr,int k, int n,int i){
        if(k==0){
            if(n==0){
                ans.add(new ArrayList<>(curr));
            }
            return ;
        }
        if(i>9 || n<0){
            return ;
        }
        curr.add(i);
    
    solve(ans,curr,k-1,n-i,i+1);
    curr.remove(curr.size()-1);
    solve(ans,curr,k,n,i+1);
    }
}