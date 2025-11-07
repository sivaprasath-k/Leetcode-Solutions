class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int size=nums.length-k+1;
        int[] res=new int[size];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int i=0,j=k,idx=0;
        while(j<=nums.length){
            List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
            list.sort((a,b)->{
                if(b.getValue().equals(a.getValue())){
                    return b.getKey()-a.getKey();
                }
                return b.getValue()-a.getValue();
            });
            int sum=0;
            for(int q=0;q<list.size() && q<x;q++){
                int num=list.get(q).getKey();
                int freq=list.get(q).getValue();
                sum+=num*freq;
            }

            res[idx]=sum;
            if(j==nums.length) break;

            map.put(nums[i],map.get(nums[i])-1);
            if(map.get(nums[i])==0) map.remove(nums[i]);
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            i++;
            j++;
            idx++;
        }
        return res;
    }
}