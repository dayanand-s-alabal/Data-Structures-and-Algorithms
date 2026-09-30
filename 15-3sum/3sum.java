class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ret = new HashSet<>();
        
        int n = nums.length;
        // for(int i = 0;i<n-2;i++){
        //     for(int j = i+1;j<n-1;j++){
        //         for(int k = j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k] == 0){
        //                 List<Integer> triplet = new ArrayList<>(
        //                     Arrays.asList(
        //                         nums[i],nums[j],nums[k]
        //                     )
        //                 );
        //                 Collections.sort(triplet);
        //                 ret.add(triplet);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(ret);

        // Better approach
        Set<List<Integer>> retSet = new HashSet<>();
        for(int i = 0;i<n-2;i++){
            Set<Integer> seenList = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int diff = -(nums[i] + nums[j]);
                if(seenList.contains(diff)){
                    List<Integer> rowList = new ArrayList<>(
                        Arrays.asList(
                            nums[i],nums[j],diff
                        )
                    );
                    Collections.sort(rowList);
                    retSet.add(rowList);
                }
                seenList.add(nums[j]);
            }
        }
        return new ArrayList<>(retSet);
    }
}