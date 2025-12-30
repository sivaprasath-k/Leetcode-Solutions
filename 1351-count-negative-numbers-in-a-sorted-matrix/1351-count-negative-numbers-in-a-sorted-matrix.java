class Solution {
    public int countNegatives(int[][] grid){
        int res=0,row=0;
        for(int col=grid.length-1;col>=0;col--){
            int flag=0;
            row=0;
            while(row<grid.length){
                if(grid[row][col]<0){
                    res++;
                    flag=1;
                }
                row++;
            }
            if(flag==0) return res;
        }
        return res;
    }
}