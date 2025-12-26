class Solution {
    public boolean isNStraightHand(int[] h, int g) {
        int len=h.length,size=g,val=-1;
        if(g==1) return true;
        if(len%g!=0) return false;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int v:h) pq.add(v);
        while(pq.size()!=0){
            if(val==-1 || size==0){
                val=pq.poll();
                size=g;
                size--;
            }
            val++;
            if(!pq.contains(val) && pq.size()!=0) return false;
            pq.remove(val);
            size--;
        }
        return true;
    }
}