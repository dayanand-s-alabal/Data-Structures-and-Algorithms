class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        // Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            long currSum = 0;
            for(int j = i;j<nums.length;j++){
                currSum += nums[j];
                if(currSum == k){
                    count++;
                }
            }
        }

        return count;
    }
}