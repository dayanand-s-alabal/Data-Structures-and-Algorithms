class Solution {
    public int subarraySum(int[] nums, int k) {
        
        // int count = 0;
        // for(int i = 0;i<nums.length;i++){
        //     long currSum = 0;
        //     for(int j = i;j<nums.length;j++){
        //         currSum += nums[j];
        //         if(currSum == k){
        //             count++;
        //         }
        //     }
        // }

        Map<Long,Long> prefixCount = new HashMap<>();
        prefixCount.put(0L,1L);

        long prefixSum = 0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;

            long neededSum = prefixSum - k;
            if(prefixCount.containsKey(neededSum)){
                count+=prefixCount.get(neededSum);
            }
            prefixCount.put(prefixSum,prefixCount.getOrDefault(prefixSum,0L)+1);
        }

        return count;
    }
}