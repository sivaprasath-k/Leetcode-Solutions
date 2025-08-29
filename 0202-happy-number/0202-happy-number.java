class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet();
        int val=n,res=0;
        while(true){
            while(val!=0){
                res=res+((val%10)*(val%10));
                val/=10;
            }
            if(hs.contains(res)) break;
            hs.add(res);
            val=res;
            res=0;
        }
        if(res==1) return true;
        return false;
    }
}