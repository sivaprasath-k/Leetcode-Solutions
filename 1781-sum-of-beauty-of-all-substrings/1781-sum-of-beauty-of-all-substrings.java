class Solution {
    public int beautySum(String s) {

        int len=s.length();
        int i=0,j=0,k=0,res=0;
        String ck="";

        int[] arr=new int[26];

        for(i=0;i<len;i++){
            for(j=i+1;j<=len;j++){

                ck=s.substring(i,j);
                int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,val1=0,val2=0;
                arr=new int[26];

                for(k=0;k<ck.length();k++){
                    int idx=ck.charAt(k)-'a';
                    arr[idx]++;
                }

                for(int v=0;v<26;v++){
                    if(arr[v]!=0){
                        min=Math.min(min,arr[v]);
                        max=Math.max(max,arr[v]);
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