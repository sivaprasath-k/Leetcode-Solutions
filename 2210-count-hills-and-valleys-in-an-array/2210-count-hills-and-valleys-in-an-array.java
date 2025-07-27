class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]) list.add(nums[i]);
        }
        list.add(nums[nums.length-1]);
        int sum=0;
        for(int i=1;i<list.size()-1;i++){
            int a=list.get(i);
            if(a<list.get(i-1) && a<list.get(i+1)) sum++;
            else if(a>list.get(i-1) && a>list.get(i+1)) sum++;
        }
        return sum;
    }
}