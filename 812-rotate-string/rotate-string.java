class Solution {
    public boolean rotateString(String s, String goal) {
        String str = s;
        if(s.length() == 0){
            return false;
        }
        if(s.length() != goal.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            if(str.equals(goal)){
                return true;
            }
            str = str.substring(1) + str.charAt(0);
        }
        return false;
    }
}