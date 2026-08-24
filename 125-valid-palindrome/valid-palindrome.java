class Solution {
    public boolean isPalindrome(String s) {
        int beg = 0,end = s.length() -1;
        while(beg < end){
            if(!Character.isLetterOrDigit(s.charAt(beg)))
                beg++;
            else if(!Character.isLetterOrDigit(s.charAt(end))) end--;
            else if(Character.toLowerCase(s.charAt(beg)) != Character.toLowerCase(s.charAt(end))) return false;
            else{
                beg++;
                end--;
            }
        }
        return true;
    }
}