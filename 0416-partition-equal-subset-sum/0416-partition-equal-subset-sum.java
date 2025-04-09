class Solution {
    void func(int index,int sum,int[] nums,ArrayList<Integer> res,int b,int[] check){
        if(check[0]==1){
            return;
        }
        if(index>=nums.length){
            if(sum==b){
                check[0]=1;
            }
            return;
        }
         func(index+1,sum+nums[index],nums,res,b,check);
         func(index+1,sum,nums,res,b,check);
    }
    public boolean canPartition(int[] nums) {
        int count=0,b=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
        }
        if(count%2!=0){
            return false;
        }
        b=count/2;
        Arrays.sort(nums);
        ArrayList<Integer> res=new ArrayList<Integer>();
        int len=nums.length;
        int middle=len/2;
        int[] check=new int[1];
        func(0,0,nums,res,b,check);
        if(check[0]==1){
            return true;
        }
        return false;
    }
}