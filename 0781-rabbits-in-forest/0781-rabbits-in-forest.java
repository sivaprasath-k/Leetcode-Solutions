class Solution {
    public int numRabbits(int[] answers) {
        //HashMap<Integer,Integer> check=new HashMap<Integer,Integer>();
        int[] nums=new int[1000];
        int ans=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==0){
                ans++;
            }
            else if(nums[answers[i]]==0){
                ans=ans+(1+answers[i]);
                //check.put(i,answers[i]);
                nums[answers[i]]=answers[i];
            }
            else{
                nums[answers[i]]--;
            }
        }
        return ans;
    }
}