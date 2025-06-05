class Solution {
    public boolean isSubsequence(String s, String t) {
        int check=0,start=0;
        StringBuilder sb = new StringBuilder(t);
        for(int i=0;i<s.length();i++){
            for(int j=start;j<sb.length();j++){
                if(s.charAt(i)==sb.charAt(j)){
                    sb.setCharAt(j, '#'); 
                    check=1;
                    start=j;
                    break;
                }
            }
            if(check==0){
                return false;
            }
            check=0;
        }
        return true;
    }
}