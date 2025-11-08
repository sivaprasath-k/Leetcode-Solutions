class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:nums) pq.add(val);
        int nu=1,res=0;
        while(!pq.isEmpty()){
            res=pq.poll();
            if(nu==k) return res;
            nu++;
        }
        return res;
    }
}