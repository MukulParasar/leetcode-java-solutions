class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list = new ArrayList<>(nums.length);
        for (int num : nums) {
            list.add(num);
        }
        int i = 1;
        while (true) {
            int curr = k * i;
            if (!list.contains(curr)) {
                return curr;
            }
            i++;
        }
    }
}