class Solution {
    public boolean isPowerOfTwo(int n) {
        // boolean a;
        if(n>0){
            if((n & (n-1))==0){
                return true;
            }
        }
        return false;
    }
}