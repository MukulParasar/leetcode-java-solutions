class Solution {
    public boolean threeFibonacciSum(int n) {
        return helper(2, 0, 1, 1, n);
    }
    private boolean helper(int sum, int i, int j, int k, int n) {
        if (sum == n) return true;
        else if (sum > n) return false;
        sum -= i;
        i = j;
        int temp = k;
        k = j + k;
        j = temp;
        sum += k;
        return helper(sum, i, j, k, n);
    }
}