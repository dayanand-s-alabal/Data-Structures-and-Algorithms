class Solution {
    public boolean checkPalindrome(String s){
        int left = 0,right=s.length()-1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void backtrack(String s, List<String> current, List<List<String>> retList){
        if(s == null || s.length()==0){
            retList.add(new ArrayList<>(current));
            return;
        }
        for(int i = 1;i<=s.length();i++){
            String temp = s.substring(0,i);
            if(!checkPalindrome(temp)) continue;
            current.add(temp);
            backtrack(s.substring(i,s.length()),current,retList);
            current.remove(current.size()-1);
        }
        return;
    }
    public List<List<String>> partition(String s) {
        if(s == null || s.length() == 0){
            return new ArrayList<>();
        }
        List<List<String>> retList = new ArrayList<>();

        backtrack(s,new ArrayList<>(),retList);
        
        return retList;
    }
}