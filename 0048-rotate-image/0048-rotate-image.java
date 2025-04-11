class Solution {
    public void rotate(int[][] matrix) {
        List<List<Integer>> rotans=new ArrayList<>();
        int last=matrix.length;
        for(int i=0;i<last;i++){
            ArrayList<Integer> ans=new ArrayList<Integer>();
            for(int j=last-1;j>=0;j--){
                ans.add(matrix[j][i]);
            }
            rotans.add(ans);
        }
        for(int i=0;i<last;i++){
            for(int j=0;j<last;j++){
                matrix[i][j]=rotans.get(i).get(j);
            }
        }
        return;
    }
}