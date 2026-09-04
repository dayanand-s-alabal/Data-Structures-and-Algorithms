class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        int longest = 1;
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num -1)){
                count = 1;
                int x = num;
                while(set.contains(x + 1)){
                    count++;
                    x++;
                }
            }
            longest = longest>count?longest:count;
        }
        return longest;
    }
}