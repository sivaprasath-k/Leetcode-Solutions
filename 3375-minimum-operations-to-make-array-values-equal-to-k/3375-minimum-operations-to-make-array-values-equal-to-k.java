class Solution {
    public int minOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int ans=0,flag=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsValue(nums[i])){
                map.put(i,nums[i]);
                if(nums[i]>k){
                    ans++;
                }
                if(nums[i]<k){
                    return -1;
                }
            }
        }
        return ans;
    }
}