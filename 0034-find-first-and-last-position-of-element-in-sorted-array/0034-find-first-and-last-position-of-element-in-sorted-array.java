class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int start=-1,end=-1;
        int left=0,right=nums.length-1,mid=left+((right-left)/2);
        // int flag=0;
        while(left<=right){
            mid=left+((right-left)/2);
            if(nums[mid]==target){
                start=mid;
                right=mid-1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        left=0;
        right=nums.length-1;
        mid=left+((right-left)/2);
        while(left<=right){
            mid=left+((right-left)/2);
            if(nums[mid]==target){
                end=mid;
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        ans[0]=start;
        ans[1]=end;
        // if(flag==0){
        //     ans={-1,-1};
        // }
        return ans;
    }
}