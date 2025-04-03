class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len+1];
        for(int i=0;i<len;i++){
            arr[nums[i]]=nums[i];
        }
        for(int i=1;i<len+1;i++){
            if(arr[i]==0){
                return i;
            }
        }
        return 0;
    }
}