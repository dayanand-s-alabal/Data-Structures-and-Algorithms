class Solution {
    public int[][] transpose(int[][] matrix,int rows,int columns){
        int[][] transpose = new int[rows][rows];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<rows;j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = transpose(matrix,rows,columns);
        int mid = columns/2;
        for(int i = 0;i<mid;i++){
            for(int j = 0;j<rows;j++){
                int temp = transpose[j][i];
                transpose[j][i] = transpose[j][columns-i-1];
                transpose[j][columns-i-1] = temp;
            }
        }
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<rows;j++){
                matrix[i][j] = transpose[i][j];
            }
        }
    }
}