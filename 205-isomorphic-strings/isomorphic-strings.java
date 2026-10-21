class Solution {
    public boolean isIsomorphic(String s, String t) {
        // StringBuffer st = new StringBuffer(s);
        // StringBuffer ts = new StringBuffer(t);
        // for(int i = 0;i<t.length();i++){
        //     char ch = t.charAt(i);
        //     for(int j = 0;j < s.length();j++){
        //         char c = s.charAt(j);
        //         if(ch == c){
        //             st.setCharAt(j,ch);
        //         }
        //     }
        // }
        // System.out.println(st);
        // return st.compareTo(ts) == 0;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),i);
            }
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),i);
            }
            if(!map1.get(s.charAt(i)).equals(map2.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}