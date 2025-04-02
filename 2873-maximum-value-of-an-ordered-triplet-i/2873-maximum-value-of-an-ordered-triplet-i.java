class Solution {
    public long maximumTripletValue(int[] nums) {
        int a=nums.length;
        long m=0,n=0,p=0,res=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<a-1;j++){
                for(int k=j+1;k<a;k++){
                    m=nums[i];
                    n=nums[j];
                    p=nums[k];
                    long w=(m-n)*p;
                    if(w>res){
                        res=w;
                    }
                }
            }
        }
        return res;
    }
}