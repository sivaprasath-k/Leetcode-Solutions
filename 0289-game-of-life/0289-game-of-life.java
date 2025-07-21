class Solution {
    public void gameOfLife(int[][] board) {
        int row=board.length;
        int column=board.length;
        int[][] arr=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(board[i][j]==1){
                    if(i-1>=0 && i+1<row && j-1>=0 && j+1<column){
                        int pre=i-1,next=i+1,count=0;
                        for(int k=0;k<column;k++){
                            if(board[pre][k]==1 || board[next][k]==1){
                                count++;
                            }
                        }
                        if(count<2 || count>3) arr[i][j]=0;
                    }
                    else{
                        int pre=i-1,next=i+1,count=0;
                        for(int k=0;k<column;k++){
                            if(pre>=0)
                        }
                    }
                }
            }
        }
    }
}