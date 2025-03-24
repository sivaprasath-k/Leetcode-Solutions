class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b) -> Integer.compare(a[0],b[0]));
        //int res=0;
        int end=meetings[0][1];
        int res=meetings[0][0]-1;
        for(int i=1;i<meetings.length;i++){
            int a=meetings[i][0];
            if(a>end){
                res+=a-end-1;
            }
            int b=meetings[i][1];
            end=Math.max(end,b);
        }
        if(end<days){
            res=res+(days-end);
        }
        return res;
    }
}