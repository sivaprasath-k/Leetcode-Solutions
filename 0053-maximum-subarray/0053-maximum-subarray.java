class Solution {
    public int maxSubArray(int[] nums) {
        int curentsum=nums[0];
        int maxfar=nums[0];
        for(int i=1;i<nums.length;i++){
            curentsum=Math.max(nums[i],curentsum+nums[i]);
            maxfar=Math.max(curentsum,maxfar);
        }
        return maxfar;
    }
}