class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();

        solve(nums,0,temp,ans);
        return ans;

    
    
    }
        public void solve(int[] nums, int i, List<Integer> temp, List<List<Integer>> ans) {
            if(i==nums.length){
                ans.add(new ArrayList<>(temp));
                return ;
            }
            temp.add(nums[i]);
                solve(nums,i+1,temp,ans);
                    temp.remove(temp.size()-1);
                    solve(nums, i + 1, temp, ans);
                }
            }
        