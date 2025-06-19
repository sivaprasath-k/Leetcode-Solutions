// class Solution {
//     public int partitionArray(int[] nums, int k) {
//         Arrays.sort(nums);
//         int count=0,i=0,j=nums.length-1,f=0;
//         while(i<=nums.length-1){
//             f=nums[j]-nums[i];
//             if(f<=k){
//                 count++;
//                 i=j+1;
//                 j=nums.length;
//             }
//             j--;
//         }
//         return count;
//     }
// }
//import java.util.Arrays;

class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1; // At least one partition
        int start = 0; // Start of the current partition
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[start] > k) {
                count++; // Need a new partition
                start = i; // Update start to current element
            }
        }
        return count;
    }
}