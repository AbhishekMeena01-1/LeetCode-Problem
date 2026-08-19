class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
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
            
            solve(ans,curr,arr,target-arr[i],i+1);
            curr.remove(curr.size()-1);
            }
            int next = i + 1;

        while (next < arr.length && arr[next] == arr[i]) {
            next++;
        }
            solve(ans,curr,arr,target,next);
    }
}
