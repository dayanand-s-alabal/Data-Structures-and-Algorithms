class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = 0;
        int second = 0;
        int[] arr = new int[m+n];
        int idx = 0;
        if(m <= 0 && n > 0){
            for(int i = 0;i<m+n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        if(n <= 0){
            return;
        }
        while(first < m && second < n){
            if(nums1[first] > nums2[second]){
                arr[idx++] = nums2[second];
                second++;
            }else{
                arr[idx++] = nums1[first];
                first++;
            }
        }
        while(first < m){
            arr[idx++] = nums1[first];
            first++;
        }
        while(second < n){
            arr[idx++] = nums2[second++];
        }
        for(int i = 0;i<m+n;i++){
            nums1[i] = arr[i];
        }
    }
}