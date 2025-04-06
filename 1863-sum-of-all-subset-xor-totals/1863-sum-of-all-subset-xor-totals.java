class Solution {
    public int subsetXORSum(int[] nums) {
        int len=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<(1<<len);i++){
            ArrayList<Integer> cal=new ArrayList<>();
            for(int j=0;j<len;j++){
                if(((1<<j)&i)!=0){
                    cal.add(nums[j]);
                }
            }
            ans.add(cal);
        }
        //System.out.println(ans.get(0).get(0));
        //int value = ans.get(1).get(1);  // returns 5
        //System.out.println(ans);
        int finalans=0;
        for(int i=1;i<(1<<len);i++){
            int value = ans.get(i).get(0);
            for(int j=1;j<ans.get(i).size();j++){
                value=value^ans.get(i).get(j);
            }
            finalans+=value;
        }
        return finalans;
    }
}