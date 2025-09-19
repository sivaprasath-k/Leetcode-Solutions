class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet();
        for(int val:nums){
            if(val>0) set.add(val);
        }
        for(int i=1;i<=set.size();i++){
            if(!set.contains(i)) return i;
        }
        return set.size()+1;
    }
}