class Solution {
    public int equalPairs(int[][] grid) {
        int ans=0,check=0;
        int len = grid[0].length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                check=0;
                for(int k=0;k<len;k++){
                    if(grid[i][k]!=grid[k][j]){
                        check++;
                    }
                }
                if(check==0){
                    ans++;
                }
            }
        }
        return ans;
    }
}