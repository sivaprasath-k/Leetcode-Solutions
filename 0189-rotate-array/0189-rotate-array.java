class Solution {
    public void rotate(int[] nums, int k) {
        int i=0,j=0,n=nums.length;
        k=k%n;
        int[] temp=new int[n];
        for(i=0,j=k;i<n-k;j++,i++) temp[j]=nums[i];
        for(j=0;i<n;i++,j++) temp[j]=nums[i];
        for(i=0,j=0;i<n;i++,j++) nums[i]=temp[j];
    }
}