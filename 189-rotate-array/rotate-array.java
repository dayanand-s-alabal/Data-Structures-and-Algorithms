class Solution {
    public void rotate(int[] nums, int k) {
        // for(int i=1;i<=k;i++){
        //     int temp = nums[nums.length -1];
        //     for(int j=nums.length -1;j > 0;j--){
        //         nums[j] = nums[j - 1];
        //     }
        //     nums[0] = temp;
        // }

        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = nums[n-k+i];
        }
        for(int i=n-k-1;i>=0;i--){
            nums[i + k] = nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i] = temp[i];
        }
    }
}