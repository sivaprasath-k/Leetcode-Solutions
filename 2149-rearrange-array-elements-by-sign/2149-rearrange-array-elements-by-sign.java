class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] a=new int[nums.length];
        int[] b=new int[nums.length];
        int i=0,j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]>=0){
                a[i]=nums[k];
                i++;
            }
            else{
                b[j]=nums[k];
                j++;
            }
        }
        int f=0,z=0,x=0;
        for(int k=0;k<nums.length;k++){
            if(f==0){
                nums[k]=a[z];
                z++;
                f=1;
            }
            else{
                nums[k]=b[x];
                x++;
                f=0;
            }
        }
        return nums;
    }
}