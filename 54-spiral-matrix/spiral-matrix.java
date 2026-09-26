class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        List<Integer> retList = new ArrayList<>();
        int top = 0,bottom = rows -1;
        int left = 0,right = columns -1;
        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                retList.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                retList.add(matrix[i][right]);
            }
            right--;
            // while(top <= bottom){
            //     retList.add(matrix[bottom][left--]);
            // }
            if(top <= bottom){
                for(int i = right;i>=left;i--){
                    retList.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    retList.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return retList;
    }
}