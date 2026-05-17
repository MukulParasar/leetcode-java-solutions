class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int totalSum = weights[0];
        int maxElem = weights[0];
        for (int i = 1; i < weights.length; i++) {
            totalSum += weights[i];
            maxElem = Math.max(maxElem, weights[i]);
        }
        int start = maxElem;
        int end = totalSum;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int D = 1;
            int sum = 0;
            for (int weight : weights) {
                if (sum + weight > mid) {
                    sum = 0;
                    D++;
                }
                sum += weight;
            }
            if (D <= days) {
                end = mid;
            } else if (D > days) {
                start = mid + 1;
            }
        }
        return start;
    }
}