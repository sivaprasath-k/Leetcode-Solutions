class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int[] a=new int[nums.length];
        int q=0;
        HashSet<Integer> f=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                a[q]=i;
                q++;
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<q;j++){
                int w=Math.abs(a[j]-i);
                if(w<=k){
                    f.add(i);
                }
            }
        }
        List<Integer> fin=new ArrayList<>(f);
        Collections.sort(fin);
        return fin;
    }
}