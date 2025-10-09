class Solution {
    public int numWaterBottles(int n, int e) {
        int ans=n,rem=n;
        while(rem>=e){
            int ad=rem/e;
            ans+=ad;
            rem=(rem%e)+ad;
        }
        return ans;
    }
}