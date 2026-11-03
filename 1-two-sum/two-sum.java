class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        // Bruteforce Approach
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             ret[0] = i;
        //             ret[1] = j;
        //             return ret;
        //         }
        //     }
        // }


        // Optimal Approach
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                ret[0] = i;
                ret[1] = map.get(req);
            }else{
                map.put(nums[i],i);
            }
        }

        Arrays.sort(ret);
        return ret;
    }
}