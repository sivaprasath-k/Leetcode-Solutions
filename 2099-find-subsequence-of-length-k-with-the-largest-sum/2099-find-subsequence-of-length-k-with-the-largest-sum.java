class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int sum=0;
        int[] cp=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum,mi=0,d=0;
        for(int i=k;i<nums.length;i++){
            sum-=nums[d];
            d++;
            sum+=nums[i];
            if(sum>max){
                max=sum;
                mi=d;
            }
        }
        int[] w=new int[k];
        List<Integer> q=new ArrayList<>();
        int z=k,in=0;
        while(z!=0){
            q.add(nums[mi]);
            mi++;
            z--;
        }
        for(int i=0;i<nums.length;i++){
            if(q.contains(cp[i]) && in<k){
                w[in]=cp[i];
                in++;
                q.remove(Integer.valueOf(cp[i]));           
            }
        }
        return w;
    }
}