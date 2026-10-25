class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }
        // int[] temp = Arrays.copyOf(nums,nums.length);

        // int count = 0;
        // for(int num : temp){
        //     if(num != 0){
        //         nums[count++] = num;
        //     }
        // }
        // for(int i=nums.length -(nums.length - count);i<nums.length;i++){
        //     nums[i] = 0;
        // }

        int j = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if( j == -1){
            return;
        }
        for(int i = j + 1; i< nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}