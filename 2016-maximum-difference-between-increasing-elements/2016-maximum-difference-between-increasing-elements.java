class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        for(int i=nums.length-1;i>=1;i--){
            for(int j=i-1;j>=0;j--){
                // if((nums[i]-nums[j])>max){
                //     max=nums[i]-nums[j];
                // }
               max= Math.max(max,(nums[i]-nums[j]));
            }
        }
        if(max>0){
            return max;
        }
        return -1;
    }
}