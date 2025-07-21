class Solution {
    public String makeFancyString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        int cur=0;
        char pre='0';
        int i=0,j=0;
        while(i<s.length()){
            char q=s.charAt(i);
            if(i==0){
                ans.append(q);
                j++;
            }
            if(pre==q){
                j++;
            }
            if(pre!=q){
                j=1;
            }
            if(j<=2 && i!=0){
                ans.append(q);
            }
            pre=q;
            i++;
        }
        return ans.toString();
    }
}