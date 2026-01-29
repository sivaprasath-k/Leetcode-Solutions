class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        List<Integer> li=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        int max=Integer.MAX_VALUE;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                max=Math.min(max,m[i][j]);
            }
            li.add(max);
            max=Integer.MAX_VALUE;
        }
        max=0;
        for(int i=0;i<m[0].length;i++){
            for(int j=0;j<m.length;j++){
                max=Math.max(max,m[j][i]);
            }
            if(li.contains(max)) res.add(max);
            max=0;
        }
        return res;
    }
}