class Solution {
    public long maximumTripletValue(int[] nums) {
        int len=nums.length;
        int[] lg=new int[len];
        int[] rg=new int[len];
        lg[0]=-1;
        rg[len-1]=-1;
        for(int i=1;i<len;i++){
            lg[i]=Math.max(lg[i-1],nums[i-1]);
        }
        for(int i=len-2;i>=0;i--){
              rg[i]=Math.max(rg[i+1],nums[i+1]);
        }
        long res=0;
        for(int i=1;i<len-1;i++){
            res=Math.max(res,(long)(lg[i]-nums[i])*rg[i]);
        }
        return res;
    }
}