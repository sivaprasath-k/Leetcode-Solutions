class Solution {
    public int maximumWealth(int[][] arr) {
        int len=arr.length;
        int i=0,res=0;
        while(i<len){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            res=Math.max(res,sum);
            i++;
        }
        return res;
    }
}