class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        // The problem can have at most two majority element with count greater than n/3
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}