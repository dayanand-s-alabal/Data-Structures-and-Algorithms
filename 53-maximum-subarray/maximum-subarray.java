class Solution {
    public int maxSubArray(int[] nums) {

        // Bruteforce approach
        // int maximum = Integer.MIN_VALUE;
        // int sum;
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         sum = 0;
        //         for(int k = i;k<=j;k++){
        //             sum += nums[k];
        //         }
        //         if(sum > maximum){
        //             maximum = sum;
        //         }
        //     }
        // }

        // OPTIMAL Approach
        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > maximum){
                maximum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }

        return maximum;
    }
}