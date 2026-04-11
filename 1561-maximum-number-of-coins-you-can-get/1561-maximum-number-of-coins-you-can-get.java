class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int maxPossibleCoinsICanHave = 0;
        int i = n - 2;
        int round = n / 3;
        while (round > 0) {
            maxPossibleCoinsICanHave += piles[i];
            i -= 2;
            round--;
        }
        return maxPossibleCoinsICanHave;
    }
}