class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int left=0,right=mat[0].length,mid=left+((right-left)/2);
        int row=0,max=Integer.MIN_VALUE,col=mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][mid]>max){
                max=mat[i][mid];
                row=i;
            }
        }
        int[] ans=new int[2];
        while(left<=right){
            mid=left+((right-left)/2);
            if(mid>0 && (mat[row][mid-1]>mat[row][mid])){
                right=mid-1;
            }
            else if(mid<col && (mat[row][mid+1]>mat[row][mid])){
                left=mid+1;
            }
            else{
                ans[0]=row;
                ans[1]=mid;
                break;
            }
        }
        return ans;
    }
}