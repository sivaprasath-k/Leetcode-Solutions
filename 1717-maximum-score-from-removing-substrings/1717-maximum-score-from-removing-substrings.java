class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st=new Stack<>();
        int score=0;
        String b="",c="";
        if(x>y){
            b="ab";
            c="ba";
        }
        else{
            b="ba";
            c="ab";
            int q=x;
            x=y;
            y=q;
        }
        st.push(s.charAt(0));
        int i=1;
        while(i<s.length()){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                String w=""+st.peek()+s.charAt(i);
                if(w.equals(b)){
                    score+=x;
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
            i++;
        }
        if(st.isEmpty()) return score;
        
        StringBuilder again=new StringBuilder();
        for(char ch:st) again.append(ch);

        Stack<Character> st2=new Stack<>();
        st2.push(again.charAt(0));
        int j=1;
        while(j<again.length()){
            if(st2.isEmpty()){
                st2.push(again.charAt(j));
            }
            else{
                String w=""+st2.peek()+again.charAt(j);
                if(w.equals(c)){
                    score+=y;
                    st2.pop();
                }
                else{
                    st2.push(again.charAt(j));
                }
            }
            j++;
        }
        return score;
    }
}


// String sec=""+st.pop();
//             if(st.isEmpty()) break;
//             String check=st.peek()+sec;
//             if(check.equals(c)){
//                 score+=y;
//                 st.pop();
//             }