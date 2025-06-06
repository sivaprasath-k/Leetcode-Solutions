class Solution {
    public String frequencySort(String s) {
        StringBuilder ans=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Character> list=new ArrayList(map.keySet());
        list.sort((obj1,obj2) ->map.get(obj2)-map.get(obj1));
        for(char f:list){
            for(int i=0;i<map.get(f);i++){
                ans.append(f);
            }
        }
        return ans.toString();
    }
}