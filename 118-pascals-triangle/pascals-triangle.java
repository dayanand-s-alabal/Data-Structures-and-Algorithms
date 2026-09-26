class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>());
        arrayList.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> prevList = arrayList.get(i-1);
            for(int j = 0;j<=i;j++){
                if(j == 0 || j==i){
                    list.add(1);
                }else{
                    list.add(prevList.get(j)+prevList.get(j-1));
                }
            }
            arrayList.add(new ArrayList<>(list));
            list.clear();
        }
        return arrayList;
    }
}