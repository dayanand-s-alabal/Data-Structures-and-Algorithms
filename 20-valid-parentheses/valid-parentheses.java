class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        if(s.length() == 1){
            return false;
        }
        if(s.charAt(0)==')' || s.charAt(0) == ']' || s.charAt(0) == '}' || s.charAt(s.length() -1)=='(' || s.charAt(s.length()-1) == '[' || s.charAt(s.length()-1) == '{'){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }else{
                if(!st.isEmpty()){
                    if(st.peek() == '[' && c == ']'){
                        st.pop();
                    }else if(st.peek() == '(' && c == ')'){
                        st.pop();
                    }else if(st.peek() == '{' && c == '}'){
                        st.pop();
                    }else{
                        return false;
                    }
                }else{
                    if(c == ')' || c == '}' || c==']'){
                        return false;
                    }
                }
            }
        }
        if(!st.isEmpty()){
            if(st.peek() == '(' || st.peek() == '[' || st.peek() == '{'){
                return false;
            }
        }
        return true;
    }
}