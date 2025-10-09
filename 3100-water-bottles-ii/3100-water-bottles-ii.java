class Solution {
    public int maxBottlesDrunk(int n, int e) {
        int ans=n,rem=n;
        int fb=0;
        while(rem>=e){
            int ad=rem-e;
            fb+=1;
            rem=ad;
            e+=1;
            if(rem<e){
                ans+=fb;
                rem+=fb;
                fb=0;
            }
        }
        return ans+fb;
    }
}