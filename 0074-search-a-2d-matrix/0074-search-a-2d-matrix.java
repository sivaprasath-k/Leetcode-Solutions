class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // System.out.println(matrix.length+"row");
        int row=matrix.length;
        int column=matrix[0].length;
        int start=0;
        for(int i=0;i<row;i++){
            if(matrix[i][0]<=target){
                start=i;
                System.out.println(matrix.length+"row");
            }
            else{
                break;
            }
        }
        for(int i=0;i<column;i++){
            if(matrix[start][i]==target){
                return true;
            }
        }
        System.out.println(start);
        return false;
    }
}