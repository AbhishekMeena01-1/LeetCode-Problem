class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        int count=0,st=0,minSt=0;
        int minLength=Integer.MAX_VALUE;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)>=0)count++;

            }
        
            while(count==t.length()){
                if(minLength>i-st+1){
                    minLength=i-st+1;
                    minSt=st;
                }
                if(map.containsKey(s.charAt(st))){
                    map.put((s.charAt(st)),map.get(s.charAt(st))+1);
                    if(map.get(s.charAt(st))>0)count--;
                }
                st++;
            }
        }
            if(minLength>s.length())return "";
            return s.substring(minSt,minSt+minLength);
        
        
    }
}