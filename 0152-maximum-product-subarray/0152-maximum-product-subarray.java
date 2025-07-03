class Solution {
    public int maxProduct(int[] nums) {
        int res1=Integer.MIN_VALUE,res2=Integer.MIN_VALUE;
         if(nums.length==1){
            return nums[0];
         }
         else{
            int i=0,j=nums.length-1;
            int prefix=1,suffix=1;
            while(j>=0){
                prefix*=nums[i];
                res1=Math.max(res1,prefix);
                if(nums[i]==0){
                    prefix=1;
                }
                i++;

                suffix*=nums[j];
                res2=Math.max(res2,suffix);
                if(nums[j]==0){
                    suffix=1;
                }
                j--;
            }
         }
         if(res1>res2){
            return res1;
         }
        return res2;
    }
}