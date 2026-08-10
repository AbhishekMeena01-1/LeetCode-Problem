class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans= new ArrayList<>();
       if(digits.length()==0){
        return ans;
       }
     String map[]={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"

     };
     StringBuilder curr = new StringBuilder();
     solve(ans,curr,digits,0,map);
     return ans;
    }
    public static void solve(List<String> ans, StringBuilder curr, String digits, int idx, String[] map){
        if(idx==digits.length()){
            ans.add(curr.toString());
            return ;
        }
        int digit= digits.charAt(idx)-'0';
        String letters=map[digit];
        for(int i=0;i<letters.length();i++){
            char ch=letters.charAt(i);
            curr.append(ch);
            solve(ans,curr,digits,idx+1, map);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}