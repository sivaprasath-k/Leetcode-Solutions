class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer> a=new HashMap<>();
         for(char b:s.toCharArray()){
            a.put(b,a.getOrDefault(b,0)+1);
         }
         int count=0;
         for(char b:t.toCharArray()){
            if(!a.containsKey(b)){
                return false;
            }
            a.put(b,a.getOrDefault(b,0)-1);
            if(a.get(b)<=0){
                a.remove(b);
            }
         }
         if(a.size()==0){
            return true;
         }
         return false;
    }
}