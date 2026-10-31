class Solution {
    public boolean canFinish(int[] piles, int speed, int h){
        int hourSum = 0;
        for(int pile : piles){
            hourSum += (pile + speed -1)/speed;
        }
        if(hourSum <= h){
            return true;
        }
        return false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        while(low < high){
            int mid = low + (high - low)/2;
            if(canFinish(piles,mid,h)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}