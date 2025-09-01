class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet();
        int third=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            Set<Integer> set=new HashSet();
            for(int j=i+1;j<nums.length;j++){
                third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    res.add(Arrays.asList(nums[i],nums[j],third));
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList(res);
        return ans;
    }
}