class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        solve(nums,ans,curr,0);
     return new ArrayList<>(ans);
    }
    public static void solve(int nums[],ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(nums[i]);
        solve(nums,ans,curr,i+1);
        curr.remove(curr.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1])i++;
        solve(nums,ans,curr,i+1);
    }

}