class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> finalans=new HashSet<>();
        int len=nums.length;
        for(int i=0;i<(1<<len);i++){
            ArrayList<Integer> check=new ArrayList<Integer>();
            for(int j=0;j<len;j++){
                if(((1<<j)&i)!=0){
                    check.add(nums[j]);
                }
            }
            finalans.add(check);
        }
        return new ArrayList<>(finalans);
    }
}