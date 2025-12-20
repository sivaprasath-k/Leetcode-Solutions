class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=0,len=strs.length;
        for(int i=0;i<strs[0].length();i++){
            for(int j=0;j<len-1;j++){
                char fi=strs[j].charAt(i);
                char se=strs[j+1].charAt(i);
                if(fi>se){
                    ans++;
                    break;
                } 
            }
        }
        return ans;
    }
}