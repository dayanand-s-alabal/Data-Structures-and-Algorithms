class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arrayList = new ArrayList<>();
        List<Integer> prevList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        arrayList.add(new ArrayList<>());
        arrayList.get(0).add(1);
        for(int i=1;i<rowIndex+1;i++){
            prevList = arrayList.get(i-1);
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    currList.add(1);
                }else{
                    currList.add(prevList.get(j) + prevList.get(j-1));
                }
            }
            arrayList.add(new ArrayList<>(currList));
            currList.clear();
            prevList.clear();
        }
        return arrayList.get(rowIndex);
    }
}