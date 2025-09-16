class Solution {
    public int candy(int[] r) {
        int len=r.length,max=2;
        int[] arr=new int[len];
        arr[0]=1;
        for(int i=1;i<len;i++){
            if(r[i]>r[i-1]){
                arr[i]=max;
                max++;
            }
            else{
                arr[i]=1;
                max=2;
            }
        }
        max=2;
        int sum=arr[len-1];
        for(int i=len-2;i>=0;i--){
            if(r[i]>r[i+1]){
                arr[i]=Math.max(max,arr[i]);
                max++;
            }
            else{
                max=2;
            }
            sum+=arr[i];
        }
        return sum;
    }
}