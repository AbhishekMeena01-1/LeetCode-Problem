class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        solve(ans,curr,arr,target,0);
        return ans;
            }
    public static void solve(List<List<Integer>> ans,List<Integer> curr, int[] arr,int target,int i){
            if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(curr));
            }
            return;
            }
            if(arr[i]<=target){
            curr.add(arr[i]);
            solve(ans,curr,arr,target-arr[i],i);
            curr.remove(curr.size()-1);
            }
            solve(ans,curr,arr,target,i+1);
    }
}