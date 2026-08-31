class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add(nums[0]);
        set2.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (set.add(nums[i])) set2.add(nums[i]);
                else set2.remove(nums[i]);
            }
        }
        return set2.size();
    }
}