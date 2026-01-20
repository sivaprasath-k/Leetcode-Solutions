class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length,max=Integer.MIN_VALUE;
        int[] res=new int[len];
        int i=len-1;
        res[i]=-1;
        max=Math.max(max,arr[i]);
        i--;
        while(i>=0){
            res[i]=max;
            max=Math.max(max,arr[i]);
            i--;
        }
        return res;
    }
}