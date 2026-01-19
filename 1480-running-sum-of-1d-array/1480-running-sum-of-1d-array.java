class Solution {
    public int[] runningSum(int[] nums) {
        int len=nums.length,sum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}