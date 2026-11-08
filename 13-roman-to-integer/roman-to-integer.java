class Solution {
    public int getInt(char c){
        switch(c){
            case 'I' : return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int total = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            int currVal = getInt(c);
            
            if(i < s.length()-1 && currVal < getInt(s.charAt(i+1))){
                total-=currVal;
            }else{
                total+=currVal;
            }

        }
        return total;
    }
}