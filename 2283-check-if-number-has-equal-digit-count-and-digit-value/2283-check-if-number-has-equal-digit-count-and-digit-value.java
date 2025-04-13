class Solution {
    public boolean digitCount(String num) {
        int len=num.length();
        //int a=Integer.parseInt(num);
        int[] check=new int[11];
        for(char str:num.toCharArray()){
            int v=str-'0';
            check[v]++;
        }
        for(int i=0;i<num.length();i++){
            int q=num.charAt(i)-'0';
            if(q!=check[i]){
                return false;
            }
        }
        return true;
    }
}