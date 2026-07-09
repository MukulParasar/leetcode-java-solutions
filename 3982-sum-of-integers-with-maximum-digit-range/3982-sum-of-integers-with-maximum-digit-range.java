class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int[] dR = new int[n];
        int maxDR = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dR[i] = digitRange(nums[i]);
            maxDR = Math.max(maxDR, dR[i]);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (dR[i] == maxDR) sum += nums[i];
        }
        return sum;
    }
    int digitRange(int num) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (num != 0) {
            int lastDigit = num % 10;
            min = Math.min(min, lastDigit);
            max = Math.max(max, lastDigit);
            num = num / 10;
        }
        return max - min;
    }
}