class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        int a=3;
        String b="11";
        String ans="";
        while(a<=n){
            char pre=b.charAt(0);
            int j=1;
            ans="";
            for(int i=1;i<b.length();i++){
                char cur=b.charAt(i);
                if(pre!=cur){
                    ans+=j;
                    ans=ans+pre;
                    j=1;
                }
                else{
                    j++;
                }
                pre=cur;
            }
            ans+=j;
            ans=ans+pre;
            a++;
            b=ans;
        }
        return b;
    }
}