class Solution {
    public int[] rearrangeArray(int[] nums) {

        //BRUTEFORCE APPROACH
        // List<Integer> positive = new ArrayList<>(nums.length/2);
        // List<Integer> negative = new ArrayList<>(nums.length/2);
        // for(int num : nums){
        //     if(num < 0){
        //         negative.add(num);
        //     }else{
        //         positive.add(num);
        //     }
        // }
        // for(int i=0;i<nums.length/2;i++){
        //     nums[2*i] = positive.get(i);
        //     nums[2*i + 1] = negative.get(i);
        // }
        // return nums;


        // OPTIMAL APPROACH
        int pos = 0,neg = 1;
        int count = 0;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                arr[pos] = nums[i];
                pos += 2;
            }else{
                arr[neg] = nums[i];
                neg += 2; 
            }
        }
        return arr;
    }
}