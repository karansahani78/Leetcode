class Solution {
    public int maxArea(int[] height) {
        // two pointer 
        int left =0;
        int right = height.length-1;
        int maxArea =0;
        while(left<=right){
            int width = right-left;
            int minHeight = Math.min(height[left],height[right]);
            int area = width * minHeight;
            maxArea = Math.max(area,maxArea);

            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}