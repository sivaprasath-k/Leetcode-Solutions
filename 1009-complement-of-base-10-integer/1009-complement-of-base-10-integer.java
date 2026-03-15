class Solution {
    public int bitwiseComplement(int n) {
        String bin=Integer.toBinaryString(n);
        String res="";
        for(char val:bin.toCharArray()){
            if(val=='1') res+='0';
            else res+='1';
        }
        int ans=Integer.parseInt(res,2);
        return ans;
    }
}