class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<Integer> map1=new HashSet<Integer>();
        HashSet<Integer> map2=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            map1.add(nums1[i]);
            map2.add(nums2[i]);
        }
        ArrayList<Integer> preans=new ArrayList<Integer>();
        for(int numb:map1){
            if(!map2.contains(numb)){
                preans.add(numb);
            }
        }
        ans.add(preans);
        preans=new ArrayList<Integer>();
        for(int numb:map2){
            if(!map1.contains(numb)){
                preans.add(numb);
            }
        }
        ans.add(preans);
        return ans;
    }
}