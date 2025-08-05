class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] a = new int[size];  // new array to store both

        // Copy nums1 into a
        for (int i = 0; i < nums1.length; i++) {
            a[i] = nums1[i];
        }

        // Copy nums2 into a
        int start = nums1.length;
        for (int val : nums2) {
            a[start] = val;
            start++;
        }

        // Sort the merged array
        Arrays.sort(a);

        // Find median
        if (size % 2 == 1) {
            return a[size / 2];  // odd length
        } else {
            return (a[(size - 1) / 2] + a[size / 2]) / 2.0;  // even length
        }
    }
}
