class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,ans=0;
        int size=s.length();
        while(i<size){
            if(map.containsKey('a') && map.containsKey('b') && map.containsKey('c')){
                int d=size-j+1;
                ans+=d;
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))<=0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            else{
                if(j<size){
                    map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                    j++;
                }
                else break;
            }
        }
        return ans;
    }
}