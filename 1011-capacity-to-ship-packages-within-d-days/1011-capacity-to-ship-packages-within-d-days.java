class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = 0;
        int max = 0;
        for (int weight : weights) {
            min = Math.max(min, weight);
            max = max + weight;
        }
        while (min <= max) {
            int mid = min + (max - min) / 2;
            int d = 1;
            int sum = 0;
            for (int weight : weights) {
                if (sum + weight > mid) {
                    d++;
                    sum = 0;
                }
                sum += weight;
            }
            if (d > days) {
                min = mid + 1;
            }
            else {  // (if d <= days)
                max = mid - 1;
            }
        }
        return min;
    }
}