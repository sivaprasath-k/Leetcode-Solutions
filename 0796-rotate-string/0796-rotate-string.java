class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=1;i<=s.length();i++){
            String a=s.substring(0,i);
            String b=s.substring(i);
            if((b+a).equals(goal)){
                return true;
            }
        }
        return false;
    }
}