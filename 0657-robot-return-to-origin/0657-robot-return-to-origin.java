class Solution {
    public boolean judgeCircle(String m) {
        int y=0,x=0;
        for(char val:m.toCharArray()){
            if(val=='U') y++;
            if(val=='D') y--;
            if(val=='L') x++;
            if(val=='R') x--;
        }  
        return y==0 && x==0;      
    }
}