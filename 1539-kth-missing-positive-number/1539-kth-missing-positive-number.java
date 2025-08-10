class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> l=new ArrayList<>();
        int start=1,ind=0;
        while(ind<arr.length){
            if(arr[ind]!=start){
                l.add(start);
                start++;
            }
            else{
                ind++;
                start++;
            }
        }
        if(l.size()<k){
            // return arr[arr.length-1]+1;
            while(l.size()!=k){
                l.add(start);
                start++;
            }
        }
        int ans=l.get(k-1);
        return ans;
    }
}