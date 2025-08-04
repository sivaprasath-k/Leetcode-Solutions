class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x) list.add(i);
        }
        int[] ans=new int[queries.length];
        int ind=0;
        for(int val:queries){
            if(val<=list.size()){
                int getans=list.get(val-1);
                ans[ind]=getans;
                ind++;
            }
            else{
                ans[ind]=-1;
                ind++;
            }
        }
        return ans;
    }
}