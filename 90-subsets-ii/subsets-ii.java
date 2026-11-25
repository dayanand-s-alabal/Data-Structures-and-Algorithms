class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> retList = new HashSet<>();

        int n = nums.length;
        int total = 1<<n;

        for(int i = 0;i<total;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if((i & (1<<j)) != 0){
                    list.add(nums[j]);
                }
            }
            Collections.sort(list);
            retList.add(list);
        }
        return new ArrayList<>(retList);
    }
}