class Solution {
    public boolean solveSudoku(char[][] board) {
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board.length;col++){
                if(board[row][col]=='.'){
                    for(char ch ='1';ch<='9';ch++){
                        if(isValid(board,row,col,ch)){
                            board[row][col]=ch;
                            if(solveSudoku(board))
                                return true;
                            
                            board[row][col]='.';
                        }
                    }
                    return false;

                }
               
            }
          
        }
           return true;
    }
    public static boolean isValid(char[][] board,int row,int col,char val){
        for(int c=0;c<board[0].length;c++){
            if(board[row][c]==val)return false;
        }
         for(int r=0;r<board[0].length;r++){
            if(board[r][col]==val)return false;
        }
        int stRow=(row/3)*3;
        int stCol=(col/3)*3;

        for(int i=stRow;i<stRow+3;i++){
            for(int j=stCol;j<stCol+3;j++){
            if(board[i][j]==val)return false;
            }
        }
        return true;
    }
}