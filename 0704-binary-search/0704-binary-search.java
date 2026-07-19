class Solution {
    public int search(int[] nums, int target) {
        return helper(0, nums.length - 1, nums, target);
    }
    int helper(int start, int end, int[] nums, int target) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if (target == nums[mid]) return mid;
        else if (target < nums[mid]) return helper(start, mid - 1, nums, target);
        else return helper(mid + 1, end, nums, target);
    }
}