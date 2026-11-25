class Solution {

    public void backtrack(int[] candidates, int target, int index, 
        List<Integer> current, List<List<Integer>> retList){
            if(target == 0){
                retList.add(new ArrayList<>(current));
                return;
            }
            if(index == candidates.length){
                return;
            }
            if(candidates[index] <= target){
                current.add(candidates[index]);
                backtrack(candidates, target-candidates[index],index,current,retList);
                current.remove(current.size()-1);
            }
            backtrack(candidates,target,index+1,current,retList);
        }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> retList = new ArrayList<>();
        
        backtrack(candidates,target,0,new ArrayList<>(), retList);
        return retList;
    }   
}