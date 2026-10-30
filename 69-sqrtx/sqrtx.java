class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1;
        int high = x;
        int ret = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if ((long) mid * mid <= x) {
                ret = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ret;
    }
}