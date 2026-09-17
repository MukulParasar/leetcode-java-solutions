class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (nums.length == 1) return 1;
        int i = 0; int j = 1;
        while (j < n) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}