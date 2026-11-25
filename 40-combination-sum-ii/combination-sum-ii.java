class Solution {
    public void combinations(int[] candidates, int index,List<Integer> current, int target, Set<List<Integer>> retList){
        if(target == 0){
            Collections.sort(current);
            retList.add(new ArrayList<>(current));
            return;
        }
        for(int i = index;i<candidates.length;i++){
            if (i > index && candidates[i] == candidates[i - 1]) {
                            continue;
            }
            if(candidates[i] > target){
                break;
            }
            current.add(candidates[i]);
            combinations(candidates,i+1,current,target-candidates[i],retList);
            current.remove(current.size() -1);
        }
        

        // if(index == candidates.length){
        //     return;
        // }
        // if(candidates[index] <= target){
        //     current.add(candidates[index]);
        //     combinations(candidates,index+1,current,target-candidates[index],retList);
        //     current.remove(current.size()-1);
        // }
        // combinations(candidates,index+1,current,target,retList);
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> retList = new HashSet<>();
        combinations(candidates,0,new ArrayList<>(),target,retList);
        return new ArrayList<>(retList);
    }
}