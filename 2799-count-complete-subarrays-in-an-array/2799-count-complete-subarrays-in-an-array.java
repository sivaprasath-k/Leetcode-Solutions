class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> a=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        //System.out.println(a.size());
        int[] b=new int[20001];
        int last=nums.length-a.size();
        int count=0,ans=0;
        int left=0,right=0;
        while(left<=last && right<nums.length){
            if(count<a.size()){
                if(b[nums[right]]==0){
                    count++;
                }
                b[nums[right]]++;
                right++;
            }
            if(count>=a.size()){
                System.out.println(a.size());
                ans=ans+(nums.length-right)+1;
                System.out.println(ans + "ch");
                b[nums[left]]--;
                if(b[nums[left]]==0){
                    count--;
                }
                left++;
            }
        }
        return ans;
    }
}