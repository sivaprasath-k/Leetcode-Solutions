class Solution {
    public int romanToInt(String s) {
        String[] a={"I","V","X","L","C","D","M"};
        int[] b={1,5,10,50,100,500,1000};
        int i=s.length()-1;
        int ans=0,cur=0,pre=0;
        while(i>=0){
            String c=String.valueOf(s.charAt(i));
            for(int j=0;j<a.length;j++){
                if(a[j].equals(c)){
                    cur=b[j];
                    break;
                }
            }
            if(cur>=pre){
                ans+=cur;
            }
            else{
                ans-=cur;
            }
            i--;
            pre=cur;
        }
        return ans;
    }
}