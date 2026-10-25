class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> set = new HashMap<>();
        for(int i = 0; i<n;i++){
            set.put(nums[i],i);
        }
        for(int i = 0;i<=n;i++){
            if(!set.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}