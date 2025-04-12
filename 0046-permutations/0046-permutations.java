class Solution {
    void func(int[] nums,ArrayList<Integer>ans,List<List<Integer>> fans,boolean[] check){
        if(ans.size()==nums.length){
            fans.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!check[i]){
                check[i]=true;
                ans.add(nums[i]);
                func(nums,ans,fans,check);
                ans.remove(ans.size()-1);
                check[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> fans=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        boolean check[]=new boolean[nums.length];
        func(nums,ans,fans,check);
        return fans;
    }
}