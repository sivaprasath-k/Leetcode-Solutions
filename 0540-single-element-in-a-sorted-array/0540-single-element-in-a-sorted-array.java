class Solution {
    public int singleNonDuplicate(int[] nums) {
         int left=0,right=nums.length-1;
         int mid=left+((right-left)/2);
         while(left<right){
            mid=left+((right-left)/2);
            if(right-left<2){
                mid+=1;
            }
             if(right==mid) break;
             if(mid%2==0){
                if(nums[mid-1]==nums[mid]) right=mid;
                else if(nums[mid+1]==nums[mid]) left=mid;
                else break;
             }
             else{
                if(nums[mid+1]==nums[mid]) right=mid;
                else if(nums[mid-1]==nums[mid]) left=mid;
                else break;
             }
         }
         return nums[mid];
    }
}