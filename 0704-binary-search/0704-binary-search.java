class Solution {
    public int search(int[] nums, int target) {
        return bs(nums, target, 0, nums.length - 1);
    }
    int bs(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (target == nums[m]) {
            return m;
        }
        if (target < nums[m]) {
            return bs(nums, target, s, m - 1);
        }
        return bs(nums, target, m + 1, e);
    }
}