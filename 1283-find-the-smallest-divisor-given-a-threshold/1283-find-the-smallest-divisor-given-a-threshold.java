class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int val:nums){
            max=Math.max(max,val);
        }
        int left=1,right=max,mid=0;
        int sum=0,fians=0;
        while(left<right){
            mid=left+((right-left)/2);
            sum=0;
            for(int i:nums){
                double ans=i/(mid*1.0);
                sum+=Math.ceil(ans);
                if(sum>threshold) break;
            }
            if(sum>threshold){
                left=mid+1;
            }
            else{
                fians=mid;
                right=mid-1;
            }
        }
        return fians;
    }
}