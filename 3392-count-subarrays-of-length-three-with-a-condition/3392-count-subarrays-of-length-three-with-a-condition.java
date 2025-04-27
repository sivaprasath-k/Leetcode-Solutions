class Solution {
    public int countSubarrays(int[] nums) {
        int index=nums.length-2;
        int ans=0;
        for(int i=0;i<index;i++){
            int a=nums[i]+nums[i+2];
            double b=nums[i+1]/2.0;
            if(a==b){
                ans++;
            }
        }
        return ans;
    }
}