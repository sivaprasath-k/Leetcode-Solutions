class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for(int val:nums) set.add(val);
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)) l.add(i);
        }
        return l;
    }
}