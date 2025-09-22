class Solution {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int[] ans=new int[len];
        for(int i=0;i<len;i++) ans[i]=nums[i]*nums[i];
        Arrays.sort(ans);
        return ans;
    }
}