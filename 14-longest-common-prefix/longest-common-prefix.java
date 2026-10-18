class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String first = strs[0];
        for(int i = 0;i<first.length();i++){
            char ch = first.charAt(i);
            for(int word = 1;word < strs.length;word++){
                if(i >= strs[word].length() || strs[word].charAt(i) != ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
}