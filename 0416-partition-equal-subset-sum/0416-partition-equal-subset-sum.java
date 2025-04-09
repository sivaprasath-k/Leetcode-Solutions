class Solution {
    void func(int index, int sum, int[] nums, ArrayList<Integer> res, int b, int[] check, HashSet<String> memo) {
        if (check[0] == 1) return;

        // Memoization: skip already processed state
        String key = index + "," + sum;
        if (memo.contains(key)) return;
        memo.add(key);

        if (index >= nums.length) {
            if (sum == b) {
                check[0] = 1;
            }
            return;
        }

        func(index + 1, sum + nums[index], nums, res, b, check, memo);
        func(index + 1, sum, nums, res, b, check, memo);
    }

    public boolean canPartition(int[] nums) {
        int count = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        if (count % 2 != 0) {
            return false;
        }

        b = count / 2;
        Arrays.sort(nums); // optional but can help in pruning
        ArrayList<Integer> res = new ArrayList<>();
        int[] check = new int[1];

        HashSet<String> memo = new HashSet<>();
        func(0, 0, nums, res, b, check, memo);

        return check[0] == 1;
    }
}