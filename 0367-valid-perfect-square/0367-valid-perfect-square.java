class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int left=2,right=num/2,mid=0;
        while(left<=right){
            mid=left+((right-left)/2);
            if((long)mid*mid==num) return true;
            else if((long)mid*mid<num) left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}