class Solution {

    public void dfs(int openP, int closeP, String s, int n, List<String> res){
        if(openP == closeP && openP + closeP == n*2){
            res.add(s);
            return;
        }
        if(openP < n){
            dfs(openP+1,closeP,s+'(',n,res);
        }
        if(closeP < openP){
            dfs(openP,closeP+1,s+')',n,res);
        }
    }

    public List<String> generateParenthesis(int n) {
        // we use DFS approach here 
        int max_length = 2 *n;
        List<String> retList = new ArrayList<>();
        dfs(0,0,"",n,retList);
        return retList;
    }
}