class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp=new int[n];
        int val1=0,val2=0,max=0,res1=0,res2=0;
        for(int i=0;i<n-1;i++){
            if(i==0 || i==1) dp[i]=nums[i];
            else{
                if(i-2>=0) val1=dp[i-2];
                if(i-3>=0) val2=dp[i-3];
                 max=Math.max(val1,val2);
                 dp[i]=max+nums[i];
            }
            res1=Math.max(res1,dp[i]);
            val1=0;
            val2=0;
        }
        dp=new int[n];
        for(int i=1;i<n;i++){
            if(i==1) dp[i]=nums[i];
            else{
                if(i-2>0) val1=dp[i-2];
                if(i-3>0) val2=dp[i-3];
                max=Math.max(val1,val2);
                dp[i]=max+nums[i];
            }
            res2=Math.max(res2,dp[i]);
            val1=0;
            val2=0;
        }
        return Math.max(res1,res2);
    }
}