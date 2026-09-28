class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int maxDepth = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
            }else if(ch == ')'){
                count--;
            }
            maxDepth = maxDepth>count?maxDepth:count;
        }
        return maxDepth;
    }
}