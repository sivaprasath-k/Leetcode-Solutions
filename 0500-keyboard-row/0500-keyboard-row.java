class Solution {
    public String[] findWords(String[] words) {
        String[] a={"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        List<String> b=new ArrayList<>();
        int cur=0,pre=1,flag=0;
        for(int i=0;i<words.length;i++){
            flag=0;
            for(int j=0;j<words[i].length();j++){
                char q=words[i].charAt(j);
                if(a[0].indexOf(q)!=-1){
                    cur=1;
                }
                else if(a[1].indexOf(q)!=-1){
                    cur=2;
                }
                else if(a[2].indexOf(q)!=-1){
                    cur=3;
                }
                if(j!=0 && cur!=pre){
                    flag=1;
                    break;
                }
                pre=cur;
            }
            if(flag==0) b.add(words[i]);
        }
        String[] ans=b.toArray(new String[0]);
        return ans;
    }
}