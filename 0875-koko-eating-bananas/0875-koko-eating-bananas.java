class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1; int end = Integer.MIN_VALUE;
        for (int p : piles) {
            if (p > end) end = p;
        }
        int k = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long curr = 0;
            for (int p : piles) {
                if (p % mid != 0) curr += p / mid + 1;
                else curr += p / mid;
            }
            if (curr <= h) {
                if (mid < k) k = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return k;
    }
}