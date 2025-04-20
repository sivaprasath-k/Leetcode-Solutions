class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int ans=0,left=0,right=nums.size()-1,check=0;
        while(left!=right){
            check=nums.get(left)+nums.get(right);
            if(check<target){
                ans+=(right-left);
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}