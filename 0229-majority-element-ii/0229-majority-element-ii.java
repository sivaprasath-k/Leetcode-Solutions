class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size=(nums.length/3)+1;
        List<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==size){
                a.add(i);
            }
        }
        return a;
    }
}