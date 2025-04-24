class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ans=0,check=0;
          for(int i=0;i<k;i++){
            ans+=nums[i];
          }
          int right=k,left=0,hgnum=ans;
          while(right<nums.length){
            ans-=nums[left];
            left++;
            ans+=nums[right];
            right++;
            if(ans>hgnum){
                hgnum=ans;
            }
          }
          double fians=(double)hgnum/k;
          return fians;
    }
}