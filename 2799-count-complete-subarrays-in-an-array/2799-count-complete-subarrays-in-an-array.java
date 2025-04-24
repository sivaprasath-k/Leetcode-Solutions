class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> a=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,right=0,ans=0;
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()==a.size()){
                ans+=nums.length-right;
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;
            }
            right++;
        }
        return ans;
    }
}