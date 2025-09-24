class Solution {
    public int minimizeArrayValue(int[] nums) {
        int j=0;
        long k=0;
        for(int i=0;i<nums.length;i++){
            k+=nums[i];
            double b=(double)k/(i+1);
            int c=(int)Math.ceil(b);
            if(c>j){
                j=c;
            }
        }
        return j;
    }
}