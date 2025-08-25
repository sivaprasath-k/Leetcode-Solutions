class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0,right=nums.length-1,mid=0;
        if(nums[0]<=nums[right]) return nums[0];
        while(left<=right){
            mid=left+((right-left)/2);
            if(nums[mid]<nums[mid-1]) return nums[mid];
            else if(nums[mid]>nums[mid+1]) return nums[mid+1];
            else if(nums[mid]>nums[n-1]) left=mid+1;
            else right=mid-1;
        }
        return nums[left];
    }
}