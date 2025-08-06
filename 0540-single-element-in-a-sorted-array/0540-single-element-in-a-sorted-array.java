class Solution {
    public int singleNonDuplicate(int[] nums) {
         int left = 0, right = nums.length - 1;
        int mid = left + ((right - left) / 2);
        
        while (left < right) {
            mid = left + ((right - left) / 2);

            if (mid % 2 == 0) {
                if (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) {
                    left = mid + 2; //  increment to make progress
                } else {
                    right = mid;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1; //  same here
                } else {
                    right = mid - 1;
                }
            }
        }

        return nums[left];
    }
}