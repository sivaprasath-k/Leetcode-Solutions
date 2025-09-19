class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val)==2) list.add(val);
            else if(map.get(val)>2) list.remove(Integer.valueOf(val));
        }
        // int[] arr=new int[list.size()];
        // for(int i=0;i<list.size();i++){
        //     arr[i]=list.get(i);
        // }
        return list;
    }
}