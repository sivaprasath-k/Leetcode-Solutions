class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start=-1,end=-1,flag=0;
        int len=intervals.length;
        List<List<Integer>> list=new ArrayList<>();
        int val1=newInterval[0],val2=newInterval[1];
        if(len==0){
            list.add(Arrays.asList(newInterval[0],newInterval[1]));
        }
        else{
            int left=0,right=len-1,mid=0;
            while(left<=right){
                mid=left+((right-left)/2);
                if(val1<=intervals[mid][1]){
                    start=mid;
                    right=mid-1;
                }
                else left=mid+1;
            }
            left=0;
            right=len-1;
            mid=0;
            while(left<=right){
                mid=left+((right-left)/2);
                if(val2>=intervals[mid][0]){
                    end=mid;
                    left=mid+1;
                }
                else right=mid-1;
            }
            if(start==-1 || end==-1){
            for(int i=0;i<len;i++) list.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            list.add(Arrays.asList(newInterval[0],newInterval[1]));
        }
        else{
            for(int i=0;i<start;i++) list.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            int min=Math.min(val1,intervals[start][0]);
            int max=Math.max(val2,intervals[end][1]);
            list.add(Arrays.asList(min,max));

            for(int i=end+1;i<len;i++) list.add(Arrays.asList(intervals[i][0],intervals[i][1]));
        }
        }
        System.out.println(start+" "+end);
        int[][] res=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i][0]=list.get(i).get(0);
            res[i][1]=list.get(i).get(1);
        }
        Arrays.sort(res,(a,b)->Integer.compare(a[0],b[0]));
        return res;
    }
}