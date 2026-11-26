class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }
        return play(n,10);
    }
    public boolean play(int n, int x){
        if(n < x){
            return false;
        }
        return !play(n-x, x-1);
    }
}