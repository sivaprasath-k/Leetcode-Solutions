class Solution {
    public boolean check(int[] nums) {
        int[] a=new int[nums.length];
        System.arraycopy(nums,0,a,0,nums.length);
        Arrays.sort(a);
        int[] b=new int[nums.length];
        int q=nums.length-1,w=0;
        for(int i=0;i<nums.length;i++){
            System.arraycopy(a,q-w,b,0,w+1);
            System.arraycopy(a,0,b,w+1,nums.length-w-1);
            w++;
            if(Arrays.equals(nums,b)){
                return true;
            }
            //if(w==nums.length-1) break;
        }
        return false;
    }
}