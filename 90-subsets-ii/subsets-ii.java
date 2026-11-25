class Solution {

    //Bruteforce
    // Set<List<Integer>> retList = new HashSet<>();
    //     Arrays.sort(nums);

    //     int n = nums.length;
    //     int total = 1<<n;

    //     for(int i = 0;i<total;i++){
    //         List<Integer> list = new ArrayList<>();
    //         for(int j = 0;j<n;j++){
    //             if((i & (1<<j)) != 0){
    //                 list.add(nums[j]);
    //             }
    //         }
    //         // Collections.sort(list);
    //         retList.add(list);
    //     }
    //     return retList;
    public void ans(int[] nums, List<List<Integer>> retList, List<Integer> res, int idx){
        retList.add(new ArrayList<>(res));
        for(int i = idx;i<nums.length;i++){
            if(i>idx && nums[i] == nums[i-1]){
                continue;
            }
            res.add(nums[i]);
            ans(nums,retList,res,i+1);
            res.remove(res.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> retList = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        ans(nums,retList,res,0);
        return retList;
    }
}