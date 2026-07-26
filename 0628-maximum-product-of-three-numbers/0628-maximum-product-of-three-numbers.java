class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxRight = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int maxLeft = nums[0] * nums[1] * nums[n - 1];
        return Math.max(maxLeft, maxRight);
    }
}