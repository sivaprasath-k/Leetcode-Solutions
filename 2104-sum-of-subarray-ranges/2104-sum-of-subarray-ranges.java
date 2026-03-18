class Solution {
    public long subArrayRanges(int[] arr) {
        int len=arr.length;
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int[] smpre=new int[len];
        int[] smnxt=new int[len];
        int[] gtpre=new int[len];
        int[] gtnxt=new int[len];
        for(int i=0;i<len;i++){
            while(!st1.isEmpty() && arr[st1.peek()]>arr[i]) st1.pop();
            if(st1.isEmpty()) smpre[i]=-1;
            else smpre[i]=st1.peek();
            st1.push(i);

            while(!st2.isEmpty() && arr[st2.peek()]<arr[i]) st2.pop();
            if(st2.isEmpty()) gtpre[i]=-1;
            else gtpre[i]=st2.peek();
            st2.push(i);
        }
        st1=new Stack<>();
        st2=new Stack<>();
        for(int i=len-1;i>=0;i--){
            while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]) st1.pop();
            if(st1.isEmpty()) smnxt[i]=len;
            else smnxt[i]=st1.peek();
            st1.push(i);

            while(!st2.isEmpty() && arr[st2.peek()]<=arr[i]) st2.pop();
            if(st2.isEmpty()) gtnxt[i]=len;
            else gtnxt[i]=st2.peek();
            st2.push(i);
        }
        long res1=0,res2=0,ans=0;
        for(int i=0;i<len;i++){
            int left=i-smpre[i],right=smnxt[i]-i;
            long val1=(long)left*right*arr[i];
            res1+=val1;
            left=i-gtpre[i];
            right=gtnxt[i]-i;
            long val2=(long)left*right*arr[i];
            res2+=val2;
        }
        ans=res2-res1;
        return ans;
    }
}