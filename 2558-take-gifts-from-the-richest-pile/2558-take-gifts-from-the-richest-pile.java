class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:gifts){
            q.add(val);
        }
        while(k!=0){
            int val=q.poll();
            int ad=(int)Math.floor(Math.sqrt(val));
            q.add(ad);
            k--;
        }
        long res=0;
        while(!q.isEmpty()){
            res+=q.poll();
        }
        return res;
    }
}