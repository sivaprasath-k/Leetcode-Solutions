class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> hs=new HashSet<Integer>();
        HashSet<Integer> hsec=new HashSet<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    hs.add(i);
                    hsec.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(hs.contains(i) || hsec.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        return;
    }
}