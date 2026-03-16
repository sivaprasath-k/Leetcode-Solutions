class Solution {
    public int sumSubarrayMins(int[] arr) {
        int len=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] pre=new int[len];
        int[] nxt=new int[len];
        for(int i=0;i<len;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()) pre[i]=-1;
            else pre[i]=st.peek();
            st.push(i);
        }
        st=new Stack<>();
        for(int i=len-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) nxt[i]=len;
            else nxt[i]=st.peek();
            st.push(i);
        }
        long val=0,ans=0,mod=1000000007;
        for(int i=0;i<len;i++){
            val=(long)(nxt[i]-i)*(i-pre[i])*arr[i];
            ans=(ans+val)%mod;
        }
        return (int)ans;
    }
}