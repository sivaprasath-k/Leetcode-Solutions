class Solution {
    public int maxFreqSum(String s) {
        int max1=0,max2=0;
        HashMap<Character,Integer> map=new HashMap();
        for(char a:s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                max1=Math.max(max1,map.get(a));
            }
            else max2=Math.max(max2,map.get(a));
        }
        return max1+max2;
    }
}