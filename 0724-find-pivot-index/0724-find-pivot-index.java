class Solution {
    public int pivotIndex(int[] nums) {
        int[] a=new int[nums.length];
        int[] b=new int[nums.length];
        a[0]=nums[0];
        b[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            a[i]=nums[i]+a[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            b[i]=nums[i]+b[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(a[i]==b[i]){
                return i;
            }
        }
        return -1;
    }
}