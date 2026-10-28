class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int maxProduct = nums[0];
        int minProduct = nums[0];

        int result = nums[0];

        for(int i = 1;i<n;i++){

            int current = nums[i];
            int oldMax = maxProduct;
            int oldMin = minProduct;

            maxProduct = Math.max(
                current,
                Math.max(oldMax * current,oldMin * current)
            );

            minProduct = Math.min(
                current,
                Math.min(oldMin * current,oldMax * current)
            );

            result = Math.max(result,maxProduct);
        }
        return result;
    }
}