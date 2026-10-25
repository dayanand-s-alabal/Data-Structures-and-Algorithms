class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int left = 0;
        int val = 0;
        boolean found = false;
        while(left <= n){
            for(int i = 0;i<n;i++){
                if(left == nums[i]){
                    found = true;
                    break;
                }
            }
            if(found == false){
                return left;
            }else{
                found = false;
            }
            left++;
        }
        return left;
    }
}