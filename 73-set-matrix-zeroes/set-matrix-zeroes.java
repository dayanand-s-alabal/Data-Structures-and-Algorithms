class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> columnSet = new HashSet<>();
        for(int i=0;i<m;i++){  // for rows
            for(int j = 0;j < n;j++){  // for columns
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    columnSet.add(j);
                }
            }
        }
        for(int r : rowSet){
            for(int i=0;i<n;i++){
                matrix[r][i] = 0;
            }
        }
        for(int c : columnSet){
            for(int i=0;i<m;i++){
                matrix[i][c] = 0;
            }
        }
        
    }
}