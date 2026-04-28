class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int i = 0;
        int evenI = 0;
        while (i < nums.length) {
            if (nums[i] % 2 == 0 && evenI != i) {
                swap(nums, evenI, i);
                evenI++;
            } else {
                i++;
            }
        }
        return nums;
    }
    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}