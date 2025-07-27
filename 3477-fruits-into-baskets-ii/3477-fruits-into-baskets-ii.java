class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> list=new ArrayList<>();
        for(int i:baskets) list.add(i);
        int check=0,ans=0;
        for(int i:fruits){
            for(int j=0;j<list.size();j++){
                if(i<=list.get(j)){
                    check=1;
                    list.remove(j);
                    break;
                }
            }
            if(check==0) ans++;
            check=0;
        }
        return ans;
    }
}