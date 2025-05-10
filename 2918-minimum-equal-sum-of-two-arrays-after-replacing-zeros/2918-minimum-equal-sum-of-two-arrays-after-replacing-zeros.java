class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int nums1zero=0,nums2zero=0;
        long sum1=0,sum2=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                nums1zero++;
                sum1+=1;
            }
            else{
                sum1+=nums1[i];
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==0){
                nums2zero++;
                sum2+=1;
            }
            else{
                sum2+=nums2[i];
            }
        }
        if(nums1zero==0 && (sum2>sum1)){
            return -1;
        }
        if(nums2zero==0 && (sum1>sum2)){
            return -1;
        }
        long finalans=Math.max(sum1,sum2);
        return finalans;
    }
}