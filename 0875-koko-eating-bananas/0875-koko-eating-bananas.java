class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Arrays.sort(piles);
        int max=Integer.MIN_VALUE;
        for(int i:piles){
            max=Math.max(max,i);
        }
        int left=1,right=max,mid=0;
        int sh=0,ans=0;
        while(left<=right){
            mid=left+((right-left)/2);
            sh=0;
            for(int i:piles){
                double ti=i/(mid*1.0);
                sh+=(int)Math.ceil(ti);
                if(sh>h) break;
            }
            if(sh<=h){
                ans=mid;
                right=mid-1;
            }
            else if(sh>h){
                left=mid+1;
            }
        }
        return ans;
    }
}