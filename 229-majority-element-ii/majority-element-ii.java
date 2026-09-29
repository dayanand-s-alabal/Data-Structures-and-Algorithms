class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int repeatation = nums.length/3;
        int maxCount = Integer.MIN_VALUE;
        List<Integer> ret = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count = 0;
            int x = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(x == nums[j]){
                    count++;
                }
            }

            if(count >= repeatation){
                int index = ret.indexOf(nums[i]);
                if(index == -1){
                    ret.add(nums[i]);
                }
            }
        }
        return ret;
    }
}