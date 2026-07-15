class Solution {
    public int singleNumber(int[] nums) {
        int totalXOR = 0;
        for (int n : nums) {
            totalXOR ^= n;
        }
        return totalXOR;
    }
}