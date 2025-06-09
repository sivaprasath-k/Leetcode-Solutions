class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(i);
        }
        Collections.sort(ans,(a,b)->a.toString().compareTo(b.toString()));
        return ans;
    }
}