class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len=nums.length,size=len-k+1,idx=0;
        int[] res=new int[size];
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(0);
        if(len==1) return nums;
        if(dq.getFirst()>=k-1){
             res[idx]=nums[dq.getFirst()];
             idx++;
        }
        for(int i=1;i<len;i++){
            while(!dq.isEmpty() && dq.getFirst()<=i-k) dq.removeFirst();
            while(!dq.isEmpty() && nums[dq.getLast()]<nums[i]) dq.removeLast();
            dq.add(i);

            if(i>=k-1){
                res[idx]=nums[dq.getFirst()];
                idx++;
            }
        }
        //res[idx]=nums[dq.getFirst()];
        return res;
    }
}