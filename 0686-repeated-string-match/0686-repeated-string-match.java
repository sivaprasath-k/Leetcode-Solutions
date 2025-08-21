class Solution {
    public int repeatedStringMatch(String a, String b) {
        int rp=(int)Math.ceil((double)b.length()/a.length());
        if(a.repeat(rp+1).contains(b)){
            if(a.repeat(rp).contains(b)){
                return rp;
            }
            else
            return rp+1;
        }
        return -1;
    }
}
