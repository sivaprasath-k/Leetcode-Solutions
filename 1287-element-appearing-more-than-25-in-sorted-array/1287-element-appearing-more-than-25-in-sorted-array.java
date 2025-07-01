class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int count=0,ans=0;
        for(int a:arr){
            if(map.get(a)>count){
                count=map.get(a);
                ans=a;
            }
        }
        return ans;
    }
}