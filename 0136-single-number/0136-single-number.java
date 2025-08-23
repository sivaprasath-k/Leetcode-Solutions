class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length;
        int left=0,right=a-1,mid=0;
        while(left<=right){
            mid=left+((right-left)/2);
            if((mid==0 ||nums[mid-1]!=nums[mid]) && (mid==a-1 || nums[mid]!=nums[mid+1]))    {
                return nums[mid];
            }
            else if(mid%2!=0){
                if(nums[mid]==nums[mid-1]){
                    left=mid+1;
                }
                else right=mid;
            }
            else{
                if(nums[mid]==nums[mid+1]){
                    left=mid+2;
                }
                else right=mid;
            }
        }
        return 1;
    }
}