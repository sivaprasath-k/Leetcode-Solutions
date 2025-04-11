class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        if(low<10){
            low=10;
        }
        for(int i=low;i<=high;i++){
            String str=Integer.toString(i);
            if(str.length()%2!=0)continue;
            int mid=str.length()/2;
            String firsthalf=str.substring(0,mid);
            String secondhalf=str.substring(mid);
            int j=0;
            int fsum=0,sesum=0;
            while(j!=mid){
                fsum+=firsthalf.charAt(j)-'0';
                sesum+=secondhalf.charAt(j)-'0';
                j++;
            }
            if(fsum==sesum){
                ans++;
            }
        }
        return ans;
    }
}