class Solution {
    void arrange(int[] nums,int low,int mid,int high){
        int left=low,right=mid+1;
        ArrayList<Integer> temp=new ArrayList<Integer>();
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
    }
    void ms(int[] nums,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        ms(nums,low,mid);
        ms(nums,mid+1,high);
        arrange(nums,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        int low=0,high=nums.length-1;
        ms(nums,low,high);
        return nums;
    }
}