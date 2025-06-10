class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        Set<Character> uni=new LinkedHashSet<>();
        int odd=0,even=101;
        for(char a:s.toCharArray()){
            uni.add(a);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(char b:uni){
            if(map.get(b)%2!=0){
                if(map.get(b)>odd){
                    odd=map.get(b);
                }
            }
            else{
                if(map.get(b)<even){
                    even=map.get(b);
                }
            }
        }
        int ans=odd-even;
        return ans;
    }
}