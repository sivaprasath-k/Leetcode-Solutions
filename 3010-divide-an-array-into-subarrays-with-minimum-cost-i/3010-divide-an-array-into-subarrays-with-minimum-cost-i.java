class Solution {
    public int minimumCost(int[] nums) {
        int ans=nums[0],st=ans,cnt=1,idx=0;
        Arrays.sort(nums);
        // if(nums[0]==ans) ans+=nums[1]+nums[2];
        // else ans+=nums[0]+nums[1];
        while(cnt<3 && idx<nums.length){
            if(nums[idx]==st) st=-1;
            else{
                ans+=nums[idx];
                cnt++;
            }
            idx++;
        }
        return ans;
    }
}