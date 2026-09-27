class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long total = 0;
        for (int s : source) total += s;
        for (int t : target) total -= t;
        return total == 0;
    }
}