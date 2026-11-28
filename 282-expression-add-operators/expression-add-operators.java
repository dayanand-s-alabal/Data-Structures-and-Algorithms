class Solution {
    public List<String> addOperators(String num, int target) {
       List<String> retList = new ArrayList<>();
        helper(num,target,"",0,0,0,retList);
        return retList;
    }

    public void helper(String s, int target, String path,int i, long eval, long residual, List<String> retList){
        if(i == s.length()){
            if(eval == target){
                retList.add(path);
                return;
            }
        }
        long num = 0;
        String currStr = "";
        for(int j=i;j<s.length();j++){
            if(j>i && s.charAt(i)=='0'){
                return;
            }
            currStr+=s.charAt(j);
            num = num*10 + s.charAt(j) - '0';
            if(i==0){
                helper(s,target,path+currStr,j+1,num,num,retList);
            }else{
                helper(s,target,path+"+"+currStr,j+1,num+eval,num,retList);
                helper(s,target,path+"-"+currStr,j+1,eval-num,-num,retList);
                helper(s,target,path+"*"+currStr,j+1,eval - residual + residual*num, residual * num,retList);
            }
        }
    }
}