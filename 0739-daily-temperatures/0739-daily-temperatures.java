class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[temperatures.length];
        //Arrays.fill(ans,0);
        for(int i=0;i<temperatures.length;i++){
            while(!st.empty() && temperatures[st.peek()]<temperatures[i]){
                int ind=st.pop();
                ans[ind]=i-ind;
            }
            st.push(i);
        }
        return ans;
    }
}