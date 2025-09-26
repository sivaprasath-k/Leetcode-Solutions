class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int ans=0;
        for(int i=0;i<len-2;i++){
            int j=i+1;
            while(j<len-1){
                int val=nums[i]+nums[j];
                for(int k=j+1;k<len;k++){
                    if(nums[k]>=val) break;
                    else ans++;
                }
                j++;
            }
        }
        return ans;
    }
}