class Solution {
    public String removeOuterParentheses(String s) {
        Stack<String> st=new Stack();
        String ans="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a!=')'){
                st.add("(");
                if(st.size()>1) ans+="(";
            }
            else{
                if(st.size()==1) st.pop();
                else{
                    st.pop();
                    ans+=")";
                }
            }
        }
        return ans;
    }
}