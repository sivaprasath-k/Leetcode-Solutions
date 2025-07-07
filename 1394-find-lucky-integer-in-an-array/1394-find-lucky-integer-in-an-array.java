class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE,check=0;
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>x:map.entrySet()){
            if(x.getKey()==x.getValue()){
                check=1;
                int w=x.getKey();
                if(w>max){
                    max=w;
                }
            }
        }
        if(check==0){
            return -1;
        }
        return max;
    }
}