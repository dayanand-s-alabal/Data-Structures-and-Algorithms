class Solution {
    public boolean checkPalindrome(String s){
        int low = 0;
        int high = s.length() - 1;
        while(low <= high){
            if(s.charAt(low++) == s.charAt(high--)){
                
            }else{
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int count = 0;
        String longest = "";
        for(int i = 0;i < s.length()-count+1;i++){
            for(int j = i;j < s.length(); j++){
                boolean isPalindrome = checkPalindrome(s.substring(i,j+1));
                int currCount = j-i+1;
                if(isPalindrome && currCount > count){
                    longest = s.substring(i,j+1);
                    count = currCount;
                }
            }
        }
        return longest;
    }
}