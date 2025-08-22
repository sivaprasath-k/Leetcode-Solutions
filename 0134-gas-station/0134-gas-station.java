class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost = 0, n = gas.length;
        int ans = 0, currgain = 0;
        for(int i = 0; i < n; i++){
            totalcost +=gas[i] - cost[i];
            currgain = currgain + gas[i] - cost[i];
            if(currgain < 0){
                ans = i + 1;
                currgain = 0;
            }
        }
        return totalcost >= 0 ? ans : -1;
    }
}