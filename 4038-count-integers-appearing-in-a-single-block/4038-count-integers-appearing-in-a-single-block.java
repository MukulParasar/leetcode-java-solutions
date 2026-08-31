class Solution {
    public int countSpecialIntegers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] && list.contains(nums[i])) {
                prev.add(nums[i]);
                list.remove(Integer.valueOf(nums[i]));
            }
            else if (!list.contains(nums[i]) && !prev.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        return list.size();
    }
}