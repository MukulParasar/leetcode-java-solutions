class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        ArrayList<Integer> pilesL = new ArrayList<>();
        for (int pile : piles) {
            pilesL.add(pile);
        }
        int maxPossibleCoinsICanHave = 0;
        for (int i = 0; i < n / 3; i++) {
            maxPossibleCoinsICanHave += pilesL.get(pilesL.size() - 2);
            pilesL.remove(0);
            pilesL.remove(pilesL.size() - 1);
            pilesL.remove(pilesL.size() - 1);
        }
        return maxPossibleCoinsICanHave;
    }
}