class Solution {
    public boolean checkString(String s) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                a = i;
            }
        }
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'b'){
                b = i;
                break;
            }
        }
        if(a > b){
            return false;
        }else{
            return true;
        }
    }
}