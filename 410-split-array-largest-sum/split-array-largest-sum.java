class Solution {
    public boolean isValid(int[] books,int students,int maxPages){
        int studentsUsed = 1;
        int currentPages = 0;
        for (int pages : books) {

            if (pages > maxPages) {
                return false;
            }

            if (currentPages + pages <= maxPages) {
                currentPages += pages;
            } else {
                studentsUsed++;
                currentPages = pages;
            }

            if (studentsUsed > students) {
                return false;
            }
        }

        return true;
    }
    public int splitArray(int[] nums, int k) {
        
        int low = Arrays.stream(nums).max().getAsInt();
        
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int high = sum;

        while(low < high){
            int mid = low + (high - low)/2;
            if(isValid(nums,k,mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }

        return low;

    }
}