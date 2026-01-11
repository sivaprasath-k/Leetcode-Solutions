class Solution {
    public String getHint(String s, String g) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int bu=0,co=0;
        String val="";
        for(int i=0;i<g.length();i++){
            int a=g.charAt(i)-'0';
            if(a==s.charAt(i)-'0') bu++;
            else{
                map.put(a,map.getOrDefault(a,0)+1);
                val+=s.charAt(i);
            }
        }
        for(int i=0;i<val.length();i++){
            int a=val.charAt(i)-'0';
            if(map.containsKey(a)){
                co++;
                map.put(a,map.get(a)-1);
                if(map.get(a)==0) map.remove(a);
            }
        }
        String ans=""+bu+'A'+co+'B';
        return ans;
    }
}