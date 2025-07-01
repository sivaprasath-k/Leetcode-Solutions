class Solution {
    public int possibleStringCount(String word) {
        int count=0;
        HashSet<Character> s=new HashSet<>();
        for(char a:word.toCharArray()){
            if(!s.contains(a)){
                s.clear();
                s.add(a);
            }
            else{
                count++;
            }
        }
        return count+1;
    }
}