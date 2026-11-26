class Solution {
    public boolean check(char[][] board, String word, int row, int col,int len){
        if(len == word.length()){
            return true;
        }
        if(row < 0 || col < 0 ||row >= board.length || col >= board[0].length){
            return false;
        }
        if(board[row][col] != word.charAt(len)){
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#';
        boolean found = (
            check(board,word,row+1,col,len+1) ||
            check(board,word,row-1,col,len+1) ||
            check(board,word,row,col+1,len+1) ||
            check(board,word,row,col-1,len+1)
        );
        board[row][col] = temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(check(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
}