class Solution {
    public int finalValueAfterOperations(String[] op) {
        int ans=0;
        for(String val:op){
            if(val.equals("--X") || val.equals("X--")) ans--;
            else ans++;
        }
        return ans;
    }
}