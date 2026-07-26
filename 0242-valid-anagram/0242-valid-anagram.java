class Solution {
    public boolean isAnagram(String s, String t) {
        int f[]=new int[26];
        for(char ch : s.toCharArray())
        f[ch-97]++;
        int f1[]=new int [26];
        for(char ch :t.toCharArray())
        f1[ch-97]++;

        for(int i=0;i<26;i++){
            if(f[i]!=f1[i]){
                return false;
            }
        }
        return true;
    }
}