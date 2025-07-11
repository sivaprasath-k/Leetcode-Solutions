class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        int size=grid.length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
                if(map.get(grid[i][j])==2) ans[0]=grid[i][j];
            }
        }
        for(int i=1;i<=size*size;i++){
            if(map.get((i))==null){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}