class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int indexDiff, int valueDiff) {
        // Stores the elements within our sliding window of size indexDiff
        set<int> st;

        // Keep track of the minimum difference found 
        int min_diff = INT_MAX, n = nums.size();

        for (int i = 0; i < n; i++) {
            // Get the first element greater than nums[i]
            auto it = st.lower_bound(nums[i]);

            // If it's found i.e. iterator isn't at the end of the set
            // Then we can include that min diff
            if (it != st.end()) {
                min_diff = min(min_diff, abs(*it - nums[i]));
            }

            // Also check the previous element if it's not the first 
            // element to avoid out of bounds errors
            if (it != st.begin()) {
                it--;
                min_diff = min(min_diff, abs(*it - nums[i]));
            }

            // Add the element to the set if not at capacity
            if (st.size() < indexDiff) {
                st.insert(nums[i]);
            } else {
                // if at capactiy then we need to remove the out of 
                // range element (last element added)
                st.erase(nums[i-indexDiff]);

                // Add the newest element
                st.insert(nums[i]);
            }

        }

        // Returns true if min distance is within the range of valueDiff
        // or false otherwise
        return min_diff <= valueDiff;
    }
};