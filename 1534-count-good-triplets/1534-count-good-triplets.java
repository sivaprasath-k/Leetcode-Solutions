class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                     int first=Math.abs(arr[i]-arr[j]);
                     int second=Math.abs(arr[j]-arr[k]);
                     int third=Math.abs(arr[i]-arr[k]);
                     if((first<=a) && (second<=b) && (third<=c)){
                        count++;
                     }
                }
            }
        }
        return count;
    }
}