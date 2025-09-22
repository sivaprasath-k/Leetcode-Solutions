class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0,res=0,check=0;
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
            max=Math.max(max,map.get(val));
            if(max>check){
                res=0;
                res+=max;
                check=max;
            }
            else if(map.get(val)==check) res+=max;
        }
        return res;
    }
}