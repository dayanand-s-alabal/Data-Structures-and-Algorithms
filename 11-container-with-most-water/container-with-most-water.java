class Solution {
    public int maxArea(int[] height) {
        // We will solve this using two pointers
        int left = 0;
        int right = height.length - 1;
        int waterArea = 0;
        while(left < right){
            int diff = right - left;
            int water = diff * Math.min(height[left],height[right]);
            waterArea = Math.max(water,waterArea);
            if(height[left] < height[right]){
                left ++;
            }else{
                right --;
            }
        }
        return waterArea;
    }
}