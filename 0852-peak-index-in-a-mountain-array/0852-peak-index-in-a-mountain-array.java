class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,right=arr.length-1,mid=0,idx=0;
        while(left<=right){
            mid=left+((right-left)/2);
            if(arr[mid]<=arr[mid+1]) left=mid+1;
            else{
                idx=mid;
                right=mid-1;
            }
        }
        return idx;
    }
}