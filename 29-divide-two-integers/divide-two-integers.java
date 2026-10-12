class Solution {
    public int divide(int dividend, int divisor) {
        if((dividend == Integer.MIN_VALUE && divisor == -1)){
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MAX_VALUE && divisor == -1){
            return -Integer.MAX_VALUE;
        }
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        int result = 0;
        while( a >= b){
            a -= b;
            result++;
        }
        if(divisor < 0 ^ dividend < 0){
            result = -result;
        }
        return result;
    }
}