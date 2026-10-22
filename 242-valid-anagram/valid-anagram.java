class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0;i < s.length();i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),1);
            }
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i),1);
            }
            if(map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
            }
        }

        Set<Character> set = map1.keySet();
        for(Character ch : set){
            if(!map1.get(ch).equals(map2.get(ch))){
                return false;
            }
        }

        return true;
    }
}