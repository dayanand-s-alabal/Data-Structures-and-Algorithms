class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int[] temp = Arrays.copyOf(nums,nums.length);

        int count = 0;
        for(int num : temp){
            if(num != 0){
                nums[count++] = num;
            }
        }
        for(int i=nums.length -(nums.length - count);i<nums.length;i++){
            nums[i] = 0;
        }
    }
}