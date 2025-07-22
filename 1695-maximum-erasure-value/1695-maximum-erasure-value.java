class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0,j=0,pre=-1;
        int sum=0,ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(i<nums.length){
            if(pre!=j){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
            pre=j;
            if(map.get(nums[j])==1){
                sum+=nums[j];
                ans=Math.max(ans,sum);
                j++;
                if(j>=nums.length) break;
            }
            else{
                map.put(nums[i],map.get(nums[i])-1);
                sum-=nums[i];
                i++;
            }
        }
        return ans;
    }
}