class Solution {
    public boolean repeatedSubstringPattern(String s) {
      int len=s.length();
      StringBuilder nstr=new StringBuilder();
      for(int i=1;i<=len/2;i++){
        nstr=new StringBuilder();
        if(len%i==0){
            String str=s.substring(0,i);
            int itr=len/i;
            for(int j=0;j<itr;j++) nstr.append(str);
        }
        if(s.equals(nstr.toString())) return true;
      }
      return false;
    }
}
