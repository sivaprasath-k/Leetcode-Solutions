class Solution {
    public int myAtoi(String s) {

        s=s.trim();
        int num=0,cnt=0,i=0;
        char[] arr=s.toCharArray();
        String res="";

        if(s.length()==0 || (arr[0]>='a' && arr[0]<='z') || (arr[0]>='A' && arr[0]<='Z')) return 0;

        for(char val:arr){

            if(val=='.' || Character.isLetter(val)) break;

            if((val=='+'||val=='-') && cnt>0) break;

            if(Character.isDigit(val)){
                cnt++;
                if(num==0 && val=='0') continue;
                else{
                    //System.out.println(val);
                    num++;
                    res+=""+val;
                }
            }
            else if(cnt==0){
                res+=""+val;
                cnt++;
            }
            else break;
        }
        //System.out.println(res);
        
        if(res.equals("")) return 0;

        long ans=0;
        int sign=1,a=0;
        if(res.charAt(0)=='-') sign=-1;

        for(char c:res.toCharArray()){

            if(c>='0' && c<='9') a=c-'0';
            else continue;

            ans=ans*10+a;
            if(sign==1 && ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign==-1 && -ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;

        }

        if(sign==-1) return (int)-ans;
        return (int)ans;
    }
}