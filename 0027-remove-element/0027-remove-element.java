class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int k = nums.length - 1;
        while (i <= k) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k--;
            } else {
                i++;
            }
        }
        return i;
    }
}