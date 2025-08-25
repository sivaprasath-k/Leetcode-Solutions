class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]){
            return 0;
        }
        else if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int left=0,right=nums.length-1,mid=0;
        while(left<=right){
            mid=left+((right-left)/2);
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]>nums[mid-1]){
                left=mid;
            }
            else{
                right=mid;
            }
        }
        return 1;
    }
}