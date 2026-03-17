class Solution {
    public int[] asteroidCollision(int[] arr) {
        int len=arr.length,i=0;
        Stack<Integer> st=new Stack<>();
        for(i=0;i<len;i++){
            int fl=0;
            if(!st.isEmpty() && arr[i]<0 && st.peek()>0){
                while(!st.isEmpty() && st.peek()>0 && 
                    Math.abs(arr[i])>=Math.abs(st.peek())){
                        if(Math.abs(arr[i])==Math.abs(st.peek())){
                            st.pop();
                            fl=1;
                            break;
                        }
                        else st.pop();
                }
                if((st.isEmpty() || (st.peek()<0 && arr[i]<0)) && fl==0) st.push(arr[i]);
            }
            else st.push(arr[i]);
        } 
        int[] res=new int[st.size()];
        for(i=0;i<st.size();i++) res[i]=st.get(i);
        return res;
    }
}