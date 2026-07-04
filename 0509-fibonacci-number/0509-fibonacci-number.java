class Solution {
    public int fib(int n) {
        // if (n < 2) return n;
        int[] nums = new int[n + 1];
        Arrays.fill(nums, -1);
        nums[0] = 0;
        if (nums.length > 1) nums[1] = 1;
        return fib(n, nums);
    }
    private int fib(int n, int[] nums) {
        if (nums[n] != -1) return nums[n];
        return nums[n] = fib(n - 1, nums) + fib(n - 2, nums);
    }
}