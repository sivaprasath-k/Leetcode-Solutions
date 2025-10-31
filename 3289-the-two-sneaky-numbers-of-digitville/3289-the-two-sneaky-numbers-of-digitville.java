class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res=new int[2];
        Arrays.sort(nums);
        int j=0,reach=0;
        while(j<nums.length-1){
            if(nums[j]==nums[j+1]){
                res[reach]=nums[j];
                reach++;
                j++;
            }
            if(reach==2) break;
            j++;
        }
        return res;
    }
}