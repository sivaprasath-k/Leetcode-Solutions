/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len=mountainArr.length();
        int left=0,right=len-1,mid=0;
        int idx=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(mountainArr.get(mid)<=mountainArr.get(mid+1)) left=mid+1;
            else{
                idx=mid;
                right=mid-1;
            }
        }
        left=0;
        right=idx;
        mid=0;
        int limit=idx,res=-1;
        while(left<=right){
            mid=left+((right-left)/2);
            if(mountainArr.get(mid)<target) left=mid+1;
            else if(mountainArr.get(mid)>target) right=mid-1;
            else{
                res=mid;
                break;
            }
        }
        if(res==-1){
            left=idx;
            right=len-1;
            mid=0;
            while(left<=right){
                mid=left+((right-left)/2);
                if(mountainArr.get(mid)<target) right=mid-1;
                else if(mountainArr.get(mid)>target) left=mid+1;
                else{
                    res=mid;
                    break;
                }
            }
        }
        return res;
    }
}