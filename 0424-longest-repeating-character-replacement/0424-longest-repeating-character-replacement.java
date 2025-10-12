class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
         int len=s.length();
         int l=0,r=0,max=Integer.MIN_VALUE,ans=Integer.MIN_VALUE,size=0;
         while(r<len){
            char val=s.charAt(r);
            hm.put(val,hm.getOrDefault(val,0)+1);
            max=Math.max(max,hm.get(val));
            size=(r-l+1)-max;
            while(size>k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
                int idx=l;
                max=Integer.MIN_VALUE;
                while(idx<=r){
                    max=Math.max(max,hm.get(s.charAt(idx)));
                    idx++;
                }
                size=(r-l+1)-max;
            }
            ans=Math.max(ans,(r-l+1));
            r++;
         }
         return ans;
    }
}


//if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));