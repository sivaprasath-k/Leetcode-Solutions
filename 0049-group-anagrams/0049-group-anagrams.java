class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> hm=new HashMap<>();
        for(String val:strs){
            char[] a=val.toCharArray();
            Arrays.sort(a);
            String key=String.valueOf(a);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList());
            }
            hm.get(key).add(val);
        }
        return new ArrayList(hm.values());
    }
}