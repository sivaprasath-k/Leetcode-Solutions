class Solution {
    public int smallestAbsent(int[] n) {
         Arrays.sort(n);
         int sum=0,len=n.length,res=0;
         for(int i=0;i<len;i++) sum+=n[i];
         int avg=sum/len;
         int next=avg+1;
         System.out.print(next+" "+avg);
         if(next<=0) next=1;
         for(int i=0;i<len;i++){
            if(n[i]==next) next+=1;
            else if(n[i]>next) break;
         }
         return next;
    }
}