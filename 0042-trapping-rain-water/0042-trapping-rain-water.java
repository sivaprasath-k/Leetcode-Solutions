class Solution {
    public int trap(int[] h) {
        int a=h.length,ans=0;
        int left=0,right=a-1;
        int lmax=0,rmax=0;
        while(left<right){
            if(h[left] < h[right]){
                if(lmax<h[left]){
                    lmax=h[left];
                    //left++;
                }
                else{
                    ans+=(lmax-h[left]);
                    left++;
                }
            }
            else{
                if(rmax<h[right]){
                    rmax=h[right];
                }
                else{
                    ans+=(rmax-h[right]);
                    right--;
                }
            }
        }
        return ans;
    }
}