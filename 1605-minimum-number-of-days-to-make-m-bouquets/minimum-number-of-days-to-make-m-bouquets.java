class Solution {
    public int possible(int[] arr, int day, int m,int k){
        int count = 0;
        int noOfB = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] <= day){
                count++;
            }else{
                noOfB+=count/k;
                count = 0;
            }
        }
        noOfB+=count/k;
        return noOfB;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val =(long) m * k;
        if(bloomDay.length < val){
            return -1;
        }
        if(k > bloomDay.length){
            return -1;
        }
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ret = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low + high)/2;
            int noOfBoc = possible(bloomDay,mid,m,k);
            if(noOfBoc < m){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}