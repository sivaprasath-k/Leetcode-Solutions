class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        // if(n==1) return 0;
        // if(n==2) return 1;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]) return i;
        }
        return n-1;
    }
}