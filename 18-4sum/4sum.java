class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        // Set<List<Integer>> set = new HashSet<>();
        // for(int i = 0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         for(int k = j+1;k < n;k++){
                    
        //             for(int l = k+1;l<n;l++){
        //                 List<Integer> array = new ArrayList<>();
        //                 if(i == j || j == k || k == l || i == l || j == l || i == l || i==k){
        //                     continue;
        //                 }else{
        //                     if(nums[i] + nums[j] + nums[k] + nums[l] == target){
        //                         array.add(nums[i]);
        //                         array.add(nums[j]);
        //                         array.add(nums[k]);
        //                         array.add(nums[l]);
        //                         Collections.sort(array);
        //                         set.add(array);
        //                     }else{
        //                         continue;
        //                     }
        //                 }
                        
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> retList = new ArrayList<>();
        // for(List<Integer> item : set){
        //     retList.add(item);
        // }
        // return retList;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<n-3;i++){
            if(i>0 && nums[i] == nums[i-1]){continue;}
            for(int j = i+1;j<n-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]){continue;}
                int left = j + 1;
                int right = nums.length-1;
                while(left < right){
                    double sum = (double) nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum < target){
                        left++;
                    }else if(sum > target){
                        right--;
                    }else{
                        list.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while(left < right && nums[left-1] == nums[left] ){
                            left++;
                        }
                        while(right > left && nums[right] == nums[right+1]){
                            right--;
                        }
                    }
                }
            }
        }
        return list;
    }
}