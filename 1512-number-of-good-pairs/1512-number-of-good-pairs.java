class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> num=new HashSet<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
            num.add(val);
        }
        int sum=0;
        for(int i:num){
            int count=map.get(i);
            int ad=(count*(count-1))/2;
            sum+=ad;
        }
        return sum;
    }
}