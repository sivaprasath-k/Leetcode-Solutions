class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0,high=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                high++;
                if(i==nums.length-1){
                    res=Math.max(res,high);
                }
            }
            else{
                res=Math.max(res,high);
                high=0;
            }
        }
        return res;
    }
}