class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int mx=0;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[j]-nums[i]==1){
                    mx=Math.max(mx,j-i+1);
                }
            }
        }
        return mx;
    }
}