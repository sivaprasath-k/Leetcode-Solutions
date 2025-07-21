class Solution {
    public int check(int i,int j,int[][] board,int row,int column){
        int count=0;

        if(i-1>=0 && board[i-1][j]==1) count++;
        if(i+1<row && board[i+1][j]==1) count++;

        if(j-1>=0 && board[i][j-1]==1) count++;
        if(j+1<column && board[i][j+1]==1) count++;

        if(i+1<row && j-1>=0 && board[i+1][j-1]==1) count++;
        if(i+1<row && j+1<column && board[i+1][j+1]==1) count++;

        if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1) count++;
        if(i-1>=0 && j+1<column && board[i-1][j+1]==1) count++;

        return count;
    }
    public void gameOfLife(int[][] board) {
        int row=board.length;
        int column=board[0].length;
        int[][] arr=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(board[i][j]==1){
                    int ans=check(i,j,board,row,column);
                    if(ans!=2 && ans!=3){
                        arr[i][j]=0;
                    }
                    else arr[i][j]=1;
                }
                else{
                    int ans=check(i,j,board,row,column);
                    if(ans==3) arr[i][j]=1;
                    // else arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                board[i][j]=arr[i][j];
            }
        }
    }
}