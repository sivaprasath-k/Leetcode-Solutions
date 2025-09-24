class Solution {
    public int search(int[] nums, int target) {
        int ans=-1;
        if(nums.length==1){
            if(nums[0]==target) return 0;
            else return -1;
        }
        if(nums.length==2){
            for(int i=0;i<2;i++){
                if(nums[i]==target) return i;
            }
            return -1;
        }
         int last=0,flag=0;
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                last=i;
                flag=1;
                break;
            }
         }
         if(flag==0) last=nums.length-1;

         int left=0,right=last,mid=left+((right-left)/2);
         while(left<=right){
            mid=left+((right-left)/2);
            if(mid>=nums.length) break;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
         }

         left=last+1;
         right=nums.length;
         if(left<nums.length){
            while(left<=right){
                mid=left+((right-left)/2);
                if(mid>=nums.length) break;
                if(nums[mid]==target) return mid;
                else if(nums[mid]<target){
                    left=mid+1;
                }
                else{
                right=mid-1;
                }
            }
         }
         return ans;
    }
}