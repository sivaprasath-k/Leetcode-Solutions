class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // int totalcost = 0, n = gas.length;
        // int ans = 0, currgain = 0;
        // for(int i = 0; i < n; i++){
        //     totalcost +=gas[i] - cost[i];
        //     currgain = currgain + gas[i] - cost[i];
        //     if(currgain < 0){
        //         ans = i + 1;
        //         currgain = 0;
        //     }
        // }
        // return totalcost >= 0 ? ans : -1;

        int len=gas.length,sidx=0;
        int run=gas[0];
        for(int i=1;i<len*2;i++){
            int idx=i%len;
            int pidx=(i-1)%len;
            run-=cost[pidx];
            if(idx==sidx && run==0) break;
            if(run>=0) run+=gas[idx];
            else{
                run=0;
                run+=gas[idx];
                sidx=idx;
                if(i>=len) return -1;
            }
        }
        return sidx;
    }
}