class Solution {
    private int findMax(int[] nums, int start, int end){
        int max = Integer.MIN_VALUE;
        for(int i=start;i<=end; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    private int findMin(int[] nums, int start, int end){
        int min = Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int max = findMax(nums,0,i);
            int min = findMin(nums,i,n-1);
            if((max - min) <= k){
                return i;
            }
        }
        return -1;
    }
}