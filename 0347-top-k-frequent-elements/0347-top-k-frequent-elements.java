class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums) map.put(val,map.getOrDefault(val,0)+1);
        int[][] arr=new int[map.size()][2];
        int idx=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            arr[idx][0]=e.getValue();
            arr[idx][1]=e.getKey();
            idx++;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int[] ans=new int[k];
        idx--;
        int i=0;
        while(k!=0){
            ans[i]=arr[idx][1];
            idx--;
            k--;
            i++;
        }
        return ans;
    }
}