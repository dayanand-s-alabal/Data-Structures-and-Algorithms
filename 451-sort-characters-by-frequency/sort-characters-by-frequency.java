class Solution {
    public String frequencySort(String s) {
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<len; i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        Set<Integer> set = new TreeSet<>(map.values());

        List<Integer> valList = new ArrayList<>(set);

        valList.sort(Comparator.reverseOrder());

        

        StringBuffer retStr = new StringBuffer();
        for(Integer val : valList){
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(Objects.equals(entry.getValue(), val)){
                    for(int i = 0;i<val;i++){
                        retStr = retStr.append(entry.getKey());
                    }
                }
            }
        }
        return new String(retStr);
    }
}