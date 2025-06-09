class Solution {
    public int findKthNumber(int n, int k) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(i);
        }
        Collections.sort(ans,(a,b)->a.toString().compareTo(b.toString()));
        int fin=ans.get(k-1);
        return fin;
    }
}