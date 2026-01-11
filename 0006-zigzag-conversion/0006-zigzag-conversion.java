class Solution {
    public String convert(String s, int n) {
        int len=s.length(),row=0,col=0,in=1;
        if(len<=n || n<2) return s;
        char[][] ans=new char[len][len];
        for(int i=0;i<len;i++){
            if(in==1){
                ans[row][col]=s.charAt(i);
                row++;
            }
            if(in==0){
                col++;
                if(row>0) row--;
                ans[row][col]=s.charAt(i);
            }
            if(row==n){
                in=0;
                row--;
            }
            else if(row==0){
                in=1;
                row++;
            }
        }
        String res="";
        for(int i=0;i<n;i++){
            for(int j=0;j<=col;j++){
                if(ans[i][j]!='\0'){
                    res+=ans[i][j];
                    System.out.print(ans[i][j]);
                }
            }
            System.out.println();
        }
        return res;
    }
}