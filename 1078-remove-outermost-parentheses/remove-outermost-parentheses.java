class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Deque<Integer> stk = new ArrayDeque<>();
        String str = "";
        int bal = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(bal > 0){
                    str += String.valueOf(ch);
                }
                bal++;
            }else{
                bal--;
                if(bal > 0)
                str += String.valueOf(ch);
                
            }
        }
        return str;
    }
}