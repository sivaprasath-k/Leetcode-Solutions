class Solution {
    public int[] deckRevealedIncreasing(int[] d) {
        int len=d.length;
        Queue<Integer> q=new LinkedList<>();
        Arrays.sort(d);
        int[] res=new int[len];
        int val=0,i=0;
        while(i<len) q.add(i++);
        while(!q.isEmpty()){
            int ind1=q.poll();
            res[ind1]=d[val];
            if(q.isEmpty()) break;
            q.add(q.poll());
            val++;
        }
        return res;
    }
}