class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int ind=0,maxcount=Integer.MIN_VALUE,count=0;
        for(int i=0;i<mat.length;i++){
            Arrays.sort(mat[i]);
            int left=0,right=mat[i].length-1,mid=0;
            while(left<=right){
                mid=left+((right-left)/2);
                if(mat[i][mid]==0) left=mid+1;
                else right=mid-1;
            }
            count=mat[i].length-right-1;
            if(count>maxcount){
                maxcount=count;
                ind=i;
            }
        }
        int[] ans={ind,maxcount};
        return ans;
    }
}