class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 1;i<=n;i++){
            int currEle = nums[i-1];
            if(n % i == 0){
                int sqr = currEle*currEle;
                sum+=sqr;
            }
        }
        return sum;
    }
}