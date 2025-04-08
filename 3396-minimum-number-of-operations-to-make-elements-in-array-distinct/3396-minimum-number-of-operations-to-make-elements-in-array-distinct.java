class Solution {
    public int minimumOperations(int[] nums) {
        int len=nums.length;
        int a=len,b=-1,count=0;
        int[] arr=new int[101];
        //arr[nums[0]]++;
        int check=0,ncome=0,find=0;
        for(int i=0;i<len-1;i++){
            find=nums[i];
            for(int j=i+1;j<len;j++){
                if(find==nums[j]){
                    check=i;
                    ncome=1;
                    break;
                }
            }
        }
        int ans=(check/3)+1;
        if(ncome==0){
            return 0;
        }
        return ans;
    }
}