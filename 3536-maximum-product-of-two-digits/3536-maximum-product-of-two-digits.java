class Solution {
    public int maxProduct(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n != 0) {
            int digit = n % 10;
            digits.add(digit);
            n /= 10;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < digits.size(); i++) {
            for (int j = 0; j < digits.size(); j++) {
                if (i == j) continue;
                max = Math.max(max, digits.get(i) * digits.get(j));
            }
        }
        return max;
    }
}