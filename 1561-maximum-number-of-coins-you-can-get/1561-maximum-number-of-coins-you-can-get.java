class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int maxPossibleCoinsICanHave = 0;
        int i = n - 2;
        int cycle = n / 3;
        while (cycle > 0) {
            maxPossibleCoinsICanHave += piles[i];
            i -= 2;
            cycle--;
        }
        return maxPossibleCoinsICanHave;
    }
}