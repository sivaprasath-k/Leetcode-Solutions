class Solution {
    public int canBeTypedWords(String t, String b) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<b.length();i++){
            char val=b.charAt(i);
            set.add(val);
        }
        int flag=0,res=0;
        for(int i=0;i<t.length();i++){
            char val=t.charAt(i);
            if(val==' '){
                if(flag==0) res++;
                flag=0;
            }
            if(set.contains(val)) flag=1;
            if(i==t.length()-1 && flag==0) res++;
        }
        return res;
    }
}