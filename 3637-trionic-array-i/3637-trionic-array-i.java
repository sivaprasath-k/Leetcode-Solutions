class Solution {
    public boolean isTrionic(int[] n) {
        int res=0,i=1,len=n.length;
        if(n[0]>n[1]) return false;
        while(i<len){
            if(n[i]<=n[i-1]) break;
            i++;
        }if(i==len) return false;
        while(i<len){
            if(n[i]>=n[i-1]) break;
            i++;
        }if(i==len) return false;
        while(i<len){
            if(n[i]<=n[i-1]) break;
            i++;
        }
        if(i==len) return true;
        return false;
    }
}