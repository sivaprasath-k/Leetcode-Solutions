class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int r=0,c=0,i=0;
        int row=mat.length-1,col=mat[0].length-1;
        int[] res=new int[(row+1)*(col+1)];
        boolean up=true;
        while(r<=row && c<=col){
            if(up){
                while(r>0 && c<col){
                    res[i++]=mat[r][c];
                    r--;
                    c++;
                }
                res[i++]=mat[r][c];
                if(c==col) r++;
                else c++;
            }
            else{
                while(r<row && c>0){
                    res[i++]=mat[r][c];
                    r++;
                    c--;
                }
                res[i++]=mat[r][c];
                if(r==row) c++;
                else r++;
            }
            up=!up;
        }
        return res;
    }
}