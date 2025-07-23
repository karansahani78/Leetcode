class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right =nums.length-1;
        int [] ans = {-1,-1};
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]<target){
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid;
                right =mid;
                // Found target, now expand to both sides
                while(left>0 && nums[left-1]==target){
                    left--;
                }
                while(right<nums.length-1 && nums[right+1]==target){
                    right++;
                }
                ans[0]=left;
                ans[1]=right;
                break;
                
            }
        }
        return ans;
        
    }
}