class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        if(numRows==0){
            return a;
        }
        b.add(1);
        a.add(b);
        for(int i=1;i<numRows;i++){
            int j=1;
            b=new ArrayList<>();
            b.add(1);
            while(j<i){
                int val=a.get(i-1).get(j)+a.get(i-1).get(j-1);
                b.add(val);
                j++;
            }
            b.add(1);
            a.add(b);
            // b.clear();
        }
        return a;
    }
}