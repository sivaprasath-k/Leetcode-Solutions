class Solution {
    public int maxDepth(String s) {
        Stack<String> st=new Stack();
        int max=Integer.MIN_VALUE;
        for(char a:s.toCharArray()){
            if(a=='(') st.add("(");
            else if(a==')') st.pop();
            max=Math.max(max,st.size());
        }
        return max;
    }
}