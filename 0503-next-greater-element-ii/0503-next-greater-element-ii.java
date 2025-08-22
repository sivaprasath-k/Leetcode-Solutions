class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int size=nums.length;
        int[] res=new int[size];
        Arrays.fill(res,-1);
        for(int i=0;i<2*size;i++){
            while(!st.empty() && nums[st.peek()]<nums[i%size]){
                res[st.pop()]=nums[i%size];
            }
            st.push(i%size);
        }
        return res;
    }
}