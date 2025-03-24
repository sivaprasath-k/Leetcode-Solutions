class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] a=new int[nums.length];
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a[n]=i;
                n++;
            }
        }
        if(k>=n){
            return nums.length;
        }
        int h=0,res=0;
        int f=0;
        int start=h;
        int end=a[k]-1;
        while(true){
            res=Math.max(res,end-start+1);
            f++;
            if(k+f==n){
                start=a[h]+1;
                // end=a[k+f-1];
                end=nums.length-1;
                res=Math.max(res,end-start+1);
                break;
            }
            else{
                start=a[h]+1;
                end=a[k+f]-1;
            }
            h++;
        }
        return res;
    }
}