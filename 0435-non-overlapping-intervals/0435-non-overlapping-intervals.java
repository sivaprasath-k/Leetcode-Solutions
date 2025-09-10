class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int ans=0,size=intervals.length;
        int end=intervals[0][1];
        for(int i=1;i<size;i++){
            if(intervals[i][0]<end) ans++;
            else end=intervals[i][1];
        }
        return ans;
    }
}