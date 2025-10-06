class Solution {
    public int minOperations(int[] nums) {
        int len=nums.length;
        int res=0;
        for(int i=0;i<=len-3;i++){
            if(nums[i]==0){
                for(int j=i;j<i+3;j++){
                    if(nums[j]==0) nums[j]=1;
                    else nums[j]=0;
                }
                res++;
            }
        }
        for(int num:nums){
            if(num==0) return -1;
        }
        return res;
    }
}