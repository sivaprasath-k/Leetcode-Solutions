class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack();
        int len=s.length(),in=0;
        if(len==1) return s;
        st.add(s.charAt(in));
        in++;
        while(in<len){
            st.add(s.charAt(in));
            in++;
            while(st.size()>1 && st.get(st.size()-1)==st.get(st.size()-2)){
                st.pop();
                st.pop();
            }
        }
        String res="";
        for(char val:st){
            res+=val;
        }
        return res;
    }
}