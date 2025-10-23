class Solution {
    public boolean hasSameDigits(String s) {
        boolean res=true;
        while(s.length()>2){
            String str="";
            int i=0;
            while(i<s.length()-1){
                int num1=s.charAt(i)-'0';
                int num2=s.charAt(i+1)-'0';
                int val=(num1+num2)%10;
                str+=val;
                i++;
            }
            s=str;
        }
        if(s.charAt(0)!=s.charAt(1)) return false;
        return res;
    }
}