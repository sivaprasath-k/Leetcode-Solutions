class Solution {
    public int gcd(int wid,int hei){
        while(hei!=0){
            int temp=hei;
            hei=wid%hei;
            wid=temp;
        }
        return wid;
    }
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<rectangles.length;i++){
            int wid=rectangles[i][0];
            int hei=rectangles[i][1];
            int gcd=gcd(wid,hei);
            wid/=gcd;
            hei/=gcd;
            String div=wid+"/"+hei;
            map.put(div,map.getOrDefault(div,0)+1);
        }
        long ans=0;
        for(Map.Entry<String,Integer> set:map.entrySet()){
            long val=set.getValue();
            ans+=(val*(val-1))/2;
        }
        return ans;
    }
}