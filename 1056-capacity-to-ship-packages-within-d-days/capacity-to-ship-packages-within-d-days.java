class Solution {
    // The problem is similar to Book Allocation Problem

    public boolean isPossible(int[] weights,int days,int max){
        int daysUsed = 1;
        int shippedWeight = 0;
        for(int weight : weights){
            if(weight > max){
                return false;
            }
            if(shippedWeight + weight <= max){
                shippedWeight+=weight;
            }else{
                daysUsed++;
                shippedWeight = weight;
            }
            if(daysUsed > days){
                return false;
            }
        }
        return true;
    }

    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for(int weight : weights){
            max+=weight;
            min = Math.max(min,weight);
        }
        int low = min;
        int high = max;
        while(low < high){
            int mid = low + (high - low)/2;
            if(isPossible(weights,days,mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}