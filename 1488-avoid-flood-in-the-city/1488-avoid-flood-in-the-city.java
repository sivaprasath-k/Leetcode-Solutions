class Solution {
    public int[] avoidFlood(int[] rains) {
        int len=rains.length,fl=0,em=0;
        int[] ans=new int[len];
        Arrays.fill(ans,1);
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            if(rains[i]==0){
                l.add(i);
            }
            else{
                if(map.containsKey(rains[i])){
                    int trg=map.get(rains[i]);
                    int le=0,ri=l.size()-1,mi=0,set=-1;
                    while(le<=ri){
                        mi=le+((ri-le)/2);
                        if(l.get(mi)<trg) le=mi+1;
                        else{
                            set=l.get(mi);
                            ri=mi-1;
                        }
                    }
                    if(set==-1) return new int[0];
                    else{
                        ans[set]=rains[i];
                        l.remove(mi);
                        map.put(rains[i],i);
                    }
                }
                else map.put(rains[i],i);
                ans[i]=-1;
            }

        }
        return ans;
    }
}