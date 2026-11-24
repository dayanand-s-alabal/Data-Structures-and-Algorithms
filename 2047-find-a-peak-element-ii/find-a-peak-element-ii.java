class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] retList = new int[2];
        int max = Integer.MIN_VALUE;

        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(mat[i][j] > max){
                    max = mat[i][j];
                    retList[0] = i;
                    retList[1] = j;
                }
            }
        }
        return retList;
    }
}