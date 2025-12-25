class Solution {
    public long maximumHappinessSum(int[] arr, int k) {
        Arrays.sort(arr);
        int check=0,len=arr.length;
        long res=0;
        for(int i=len-1;i>=0;i--){
            if(k>0){
                res+=arr[i]-check;
                k--;
                check++;
            }
            if(k==0 || (arr[i-1]-check)<=0) break;
        }
        return res;
    }
}