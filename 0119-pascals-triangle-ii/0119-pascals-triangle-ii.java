class Solution {
    public List<Integer> getRow(int x) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        b.add(1);
        if(x==0) return b;
        a.add(b);
        b.add(1);
        a.add(b);
        if(x==1) return a.get(1);
        for(int i=2;i<=x;i++){
            b=new ArrayList<>();
            b.add(1);
            for(int j=0;j<i-1;j++){
                int st=a.get(i-1).get(j)+a.get(i-1).get(j+1);
                b.add(st);
            }
            b.add(1);
            a.add(b);
        }
        return b;
    }
}