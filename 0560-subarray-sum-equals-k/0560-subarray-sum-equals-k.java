class Solution {
    public int subarraySum(int[] nums, int k) {
       int len=nums.length,res=0,sum=0;
       for(int i=0;i<len;i++){
        sum=0;
        for(int j=i;j<len;j++){
            sum+=nums[j];
            if(sum==k){
                res++;
            }
        }
       }
       return res;
    }
}