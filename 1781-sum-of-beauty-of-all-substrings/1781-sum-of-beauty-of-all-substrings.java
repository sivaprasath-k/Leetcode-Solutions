class Solution {
    public int beautySum(String s) {

        int len=s.length();
        int i=0,j=0,k=0,res=0;
        String ck="";

        int[] arr=new int[26];

        for(i=0;i<len;i++){
            arr=new int[26];
            for(j=i;j<len;j++){
                
                int idx=(int)s.charAt(j)-'a';
                arr[idx]++;
                int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

                for(int v:arr){
                    if(v!=0){
                        min=Math.min(min,v);
                        max=Math.max(max,v);
                    }
                }
                res+=max-min;
            }
        }
        return res;
    }
}
//System.out.println(ck+" "+max+" min: "+min);
//System.out.println(ck);