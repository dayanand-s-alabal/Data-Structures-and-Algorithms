class Solution {
    public int[][] transpose(int[][] matrix,int m,int n){
        int[][] ret = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                ret[j][i] = matrix[i][j];
            }
        }
        return ret;
    }

    public void rotate(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        
        int[][] transpose = transpose(matrix,rowLen,colLen);

        for(int i =0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                matrix[i][j] = transpose[i][j];
            }
        }

        for(int i=0;i<rowLen;i++){
            for(int j = 0;j<colLen/2;j++){
                int temp = matrix[i][colLen-j-1];
                matrix[i][colLen-j-1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        
    }
}