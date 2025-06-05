class Solution {
    public boolean isIsomorphic(String s, String t) {
        int as[]=new int[256];
        int dt[]=new int[256];
        for(int i=0;i<s.length();i++){
            int b=s.charAt(i);
            int c=t.charAt(i);
            if(as[b]!=dt[c]){
                return false;
            }
            as[b]=i+1;
            dt[c]=i+1;
        }
        return true;
    }
}