class Solution {
    public int totalFruit(int[] fruits) {
        int sum=0,ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        while(j<fruits.length){
            if(map.size()<=2){
                map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
                if(map.size()<=2) sum+=1;
                ans=Math.max(ans,sum);
                j++;
            }
            else{
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])<=0){
                    map.remove(fruits[i]);
                }
                sum-=1;
                i++;
                if(map.size()<=2) sum+=1;
            }
        }
        return ans;
    }
}