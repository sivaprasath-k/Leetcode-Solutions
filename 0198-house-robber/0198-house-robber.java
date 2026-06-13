class Solution {
    public int rob(int[] nums) {
        int n=nums.length,ev=0,odd=0;
        if(n==1) return nums[0];
        int[] dp=new int[n];
        Arrays.fill(dp,0);
        int val1=0,val2=0;
        for(int i=0;i<n;i++){
            if(i==0 || i==1) dp[i]=nums[i];
            else{
                if(i-2>=0) val1=dp[i-2];
                if(i-3>=0) val2=dp[i-3];
                int st=Math.max(val1,val2);
                dp[i]=nums[i]+st;
            }
        }
        return Math.max(dp[n-1],dp[n-2]);
    }
}