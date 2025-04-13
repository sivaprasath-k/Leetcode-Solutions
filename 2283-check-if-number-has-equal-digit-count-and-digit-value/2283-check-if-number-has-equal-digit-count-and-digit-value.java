class Solution {
    public boolean digitCount(String num) {
        int len=num.length();
        int a=Integer.parseInt(num);
        int[] check=new int[11];
        while(len!=0){
            int b=a%10;
            a/=10;
            check[b]++;
            len--;
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