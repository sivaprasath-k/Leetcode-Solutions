class Solution {
    public boolean validMountainArray(int[] arr) {
        int m=0,in=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
                in=i;
            }
        }
        if(in==0 || in==arr.length-1){
            return false;
        }
        int c=0;
        for(int i=in;i>0;i--){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }
        for(int i=in;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}