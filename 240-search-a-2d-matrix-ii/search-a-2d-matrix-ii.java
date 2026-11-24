class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int oLow = 0;
        while(oLow <= m){
            int iLow = 0;
            int iHigh = n;
            while(iLow <= iHigh){
                int mid = iLow + (iHigh - iLow)/2;
                if(matrix[oLow][mid] == target){
                    return true;
                }else if(matrix[oLow][mid] > target){
                    iHigh = mid - 1;
                }else{
                    iLow = mid + 1;
                }
            }
            oLow++;
        }
        return false;
    }
}