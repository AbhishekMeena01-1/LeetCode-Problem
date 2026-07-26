class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWord=0;
        for(String sentence:sentences){
       int sp=0;
       for(char ch : sentence.toCharArray()){
        if(ch==' '){
            sp++;
        }
       }
       maxWord=Math.max(maxWord,sp+1);
    }
    return maxWord;
}
}