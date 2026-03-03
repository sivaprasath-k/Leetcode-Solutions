class Solution {
    public int countSubstrings(String s) {
        int len=s.length(),res=0;
        for(int i=0;i<len;i++){
            String str="";
            for(int j=i;j<len;j++){
                str+=s.charAt(j);
                StringBuilder sb=new StringBuilder(str);
                if(str.equals(sb.reverse().toString())) res++;
            }
        }
        return res;
    }
}