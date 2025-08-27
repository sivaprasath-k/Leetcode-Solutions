class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int max=Integer.MIN_VALUE;
        double check=(double)Integer.MIN_VALUE;
        for(int i=0;i<d.length;i++){
            int val=(d[i][0]*d[i][0])+(d[i][1]*d[i][1]);
            // System.out.println(val);
            double num=(double)Math.sqrt(val);
            if(num>=check){
                // System.out.println(val);
                if(num==check) max=Math.max(max,(d[i][0]*d[i][1]));
                else
                  max=d[i][0]*d[i][1];
                check=num;
            }
        }
        return max;
    }
}