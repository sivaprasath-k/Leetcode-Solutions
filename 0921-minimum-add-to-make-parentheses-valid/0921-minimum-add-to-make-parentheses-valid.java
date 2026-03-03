class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int res=0,ct=0;
        for(char val:s.toCharArray()){
            if(val=='(') ct++;
            else{
                if(ct!=0) ct--;
                else res++;
            }
        }
        res+=ct;
        return res;
    }
}