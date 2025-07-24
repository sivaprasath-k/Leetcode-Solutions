class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int len=nums.length,res=0,sum=0;
       for(int i=0;i<len;i++){
        sum=0;
        for(int j=i;j<len;j++){
            sum+=nums[j];
            if(sum==goal){
                res++;
            }
        }
       }
       return res;
    }
}