class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=2;i<nums.length;i+=3){
            int a=nums[i]-nums[i-2];
            if(a>k){
                return new int[0][0];
            }
        }
        int[][] result = new int[nums.length / 3][3];
        for (int i = 0; i < nums.length; i += 3) {
            result[i / 3][0] = nums[i];
            result[i / 3][1] = nums[i + 1];
            result[i / 3][2] = nums[i + 2];
        }

        return result;
    }
}