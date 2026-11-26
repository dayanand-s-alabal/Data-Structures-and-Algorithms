class Solution {

    public void combinations(int k,int num, int n, List<Integer> current, List<List<Integer>> retList){
        if(n == 0 && k == 0){
            retList.add(new ArrayList<>(current));
            return;
        }
        for(int i = num;i<10;i++){
            if(i > n || k<=0) break;
            current.add(i);
            combinations(k-1,i+1,n-i,current,retList);
            current.remove(current.size() -1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> retList = new ArrayList<>();
        combinations(k,1,n,new ArrayList<>(),retList);
        return retList;
    }
}