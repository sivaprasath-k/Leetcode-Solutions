class Solution {
    public int[] sortedSquares(int[] arr) {
        int len=arr.length;
        int[] ans=new int[len];
        int st=0,en=len-1;
        for(int i=len-1;i>=0;i--){
            if(arr[st]*arr[st]>arr[en]*arr[en]){
                ans[i]=arr[st]*arr[st];
                st++;
            }
            else{
                ans[i]=arr[en]*arr[en];
                en--;
            }
        }
        return ans;
    }
}