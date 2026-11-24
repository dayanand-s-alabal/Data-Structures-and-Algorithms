class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int oLow = 0;
        int oHigh = matrix.length - 1;
        while(oLow <= oHigh){
            int oMid = oLow + (oHigh - oLow)/2;
            int iLow = 0;
            int iHigh = matrix[0].length - 1;
            if(matrix[oMid][0] <= target && matrix[oMid][n] >= target){
                while(iLow <= iHigh){
                    int iMid = iLow + (iHigh - iLow)/2;
                    if(matrix[oMid][iMid] == target){
                        return true;
                    }else if(matrix[oMid][iMid] < target){
                        iLow = iMid + 1;
                    }else{
                        iHigh = iMid - 1;
                    }
                }
                return false;
                // oLow = oMid +1;

            }else{
                if(matrix[oMid][0] > target){
                    oHigh = oMid - 1;
                }else{
                    oLow = oMid + 1;
                }
            }
        }
        return false;
    }
}