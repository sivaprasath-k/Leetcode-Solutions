class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st=new Stack();
        st.add(0);
        for(int i=1;i<nums.length;i++){
            if(nums[st.peek()]>nums[i]){
                st.add(i);
            }
        }
        int j=nums.length-1,max=0;
        while(!st.isEmpty()){
            if(st.peek()>=j) st.pop();
            if(!st.isEmpty() && nums[st.peek()]<=nums[j]){
                max=Math.max(max,(j-st.pop()));
            }
            else j--;
        }
        return max;
    }
}