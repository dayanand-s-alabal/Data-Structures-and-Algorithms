class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] + nums[j] == target){
        //             ret[0] = i;
        //             ret[1] = j;
        //             return ret;
        //         }
        //     }
        // }

        int req;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length; i++){
            req = target - nums[i];
            if(map.containsKey(req)){
                ret[0] = i;
                ret[1] = map.get(req);
            }else{
                map.put(nums[i],i);
            }
        }

        if(ret[0] > ret[1]){
            ret[0] = ret[0] + ret[1];
            ret[1] = ret[0] - ret[1];
            ret[0] = ret[0] - ret[1];
        }
        
        return ret;
    }
}