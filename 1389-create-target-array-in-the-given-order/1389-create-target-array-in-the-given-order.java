class Solution {
    public int[] createTargetArray(int[] n, int[] in) {
        List<Integer> res=new ArrayList<>();
        int len=n.length;
        for(int i=0;i<len;i++){
            int idx=in[i];
            int val=n[i];
            res.add(idx,val);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}