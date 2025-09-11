class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        PriorityQueue<Integer> st=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            st.add(i);
        }
        while(st.size()>2){
            int val=st.poll()-st.poll();
            st.add(val);
        }
        int ans=st.poll()-st.poll();
        return ans;
    }
}