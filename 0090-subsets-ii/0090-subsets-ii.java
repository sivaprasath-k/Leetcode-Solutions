class Solution {
    void func(int index, int[] arr, List<Integer> current, Set<List<Integer>> res) {
        if (index == arr.length) {
            res.add(current);  // Must add a copy
            return;
        }
        // Include the current element
        List<Integer> include = new ArrayList<>(current);
        include.add(arr[index]);
        func(index + 1, arr, include, res);

        // Exclude the current element
        //List<Integer> exclude = new ArrayList<>(current);
        func(index + 1, arr, current, res); // No need to clone again
    }

    public List<List<Integer>> subsetsWithDup(int[] nums)  {
        Arrays.sort(nums);
        Set<List<Integer>> res=new HashSet<>();
        func(0, nums, new ArrayList<>(), res);
        return new ArrayList<>(res);
    }
}