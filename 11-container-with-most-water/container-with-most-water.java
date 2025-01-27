class Solution {
    public int maxArea(int[] height) {
        // optimal approach
        int maxWater =0;
        int left =0;
        int right = height.length-1;
        while(left<right){
            // minimum height
            int shorterHeight;
            if(height[left]<height[right]){
                shorterHeight = height[left];
            }else {
                shorterHeight = height[right];
            }
            // water between left and right bar
            int water = shorterHeight*(right-left);
            if(water>maxWater){
                maxWater = water;
            }
            // if left smaller then increase it 
            if(height[left]<height[right]){
                left++;
            }
            // if right is bigger then decrease it 
            else {
                right--;
            }
        }
        return maxWater;
        
    }
}