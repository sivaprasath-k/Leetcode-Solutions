class Solution {
    public int maxArea(int[] height) {
        int a=height.length;
        int left=0,right=a-1,mid=0;
        int curwater=0,max=0;
        while(left<=right){
            int width=right-left;
            if(height[left]<height[right]){
                curwater=Math.min(height[left],height[right])*width;
                max=Math.max(curwater,max);
                left++;
            }
            else{
                curwater=Math.min(height[left],height[right])*width;
                max=Math.max(curwater,max);
                right--;
            }
        }
        return max;
    }
}