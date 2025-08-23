class Solution {
    public int trap(int[] h) {
        int a=h.length;
        int[] lmax=new int[h.length];
        int[] rmax=new int[h.length];
        lmax[0]=h[0];
        rmax[a-1]=h[a-1];
        for(int i=1;i<a;i++){
            lmax[i]=Math.max(h[i],lmax[i-1]);
        }
        for(int i=a-2;i>=0;i--){
            rmax[i]=Math.max(h[i],rmax[i+1]);
        }
        int res=0;
        for(int i=0;i<a;i++){
            res+=Math.min(lmax[i],rmax[i])-h[i];
        }
        return res;
    }
}