class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    if(stack.peek() == '('){
                        stack.pop();
                    }else{
                        count++;
                    }
                }else{
                    count++;
                }
            }
        }
        if(stack.isEmpty()){
            return count;
        }else{
            while(!stack.isEmpty()){
                stack.pop();
                count++;
            }
        }
        return count;
    }
}