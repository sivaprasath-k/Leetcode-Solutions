class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len=nums.length,i=0,j=len-1;
        int[] arr=new int[len];
        for(int val:nums){
            if(val%2==0){
                arr[i]=val;
                i++;
            }
            else{
                arr[j]=val;
                j--;
            }
        }
        return arr;
    }
}