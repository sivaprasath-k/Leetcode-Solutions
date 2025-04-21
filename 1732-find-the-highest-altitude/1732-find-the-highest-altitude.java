class Solution {
    public int largestAltitude(int[] gain) {
        int[] nums=new int[101];
        nums[0]=0;
        int ans=0;
        for(int i=0;i<gain.length;i++){
            nums[i+1]=nums[i]+gain[i];
            if(ans<nums[i+1]){
                ans=nums[i+1];
            }
        }
        return ans;
    }
}