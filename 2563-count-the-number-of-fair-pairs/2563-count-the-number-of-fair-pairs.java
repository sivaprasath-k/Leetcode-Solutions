class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int ans=0,lans=0,uans=0;
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        while(left!=right){
            if(nums[left]+nums[right]<lower){
                lans+=right-left;
                left++;
            }
            else{
                right--;
            }
        }
        left=0;
        right=nums.length-1;
        while(left!=right){
            if(nums[left]+nums[right]<=upper){
                uans+=right-left;
                left++;
            }
            else{
                right--;
            }
        }
        ans=uans-lans;
        return ans;
    }
}