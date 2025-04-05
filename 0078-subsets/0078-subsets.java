class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int len=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<(1<<len);i++){
            ArrayList<Integer> number=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(((1<<j)&i) !=0){
                    number.add(nums[j]);
                }
            }
            res.add(number);
        }
        return res;
    }
}