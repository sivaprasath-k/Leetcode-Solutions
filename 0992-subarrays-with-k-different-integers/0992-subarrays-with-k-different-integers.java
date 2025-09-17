class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        //HashMap<Integer,Integer> map=new HashMap<>();
        int len=nums.length,count1=0,count2=0;
        int i=0,j=0;
        while(i<len && j<len){
            hs.put(nums[j],hs.getOrDefault(nums[j],0)+1);
            if(hs.size()<=k){
                count1+=j-i+1;
            }
            else{
                while(hs.size()>k){
                    hs.put(nums[i],hs.getOrDefault(nums[i],0)-1);
                    if(hs.get(nums[i])<=0) hs.remove(nums[i]);
                    i++;
                }
                count1+=j-i+1;
            }
            j++;
        }
        i=0;
        j=0;
        hs=new HashMap<>();
        while(i<len && j<len){
            hs.put(nums[j],hs.getOrDefault(nums[j],0)+1);
            if(hs.size()<=k-1) count2+=j-i+1;
            else{
                while(hs.size()>k-1){
                    hs.put(nums[i],hs.getOrDefault(nums[i],0)-1);
                    if(hs.get(nums[i])<=0) hs.remove(nums[i]);
                    i++;
                }
                count2+=j-i+1;
            }
            j++;
        }
        return count1-count2;
    }
}