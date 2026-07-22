class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0 || n == 2) return false;
        if (n == 1) return true;
        if (n % 3 == 0) return helper(n, 0);
        else return false;
    }
    private boolean helper(int n, int r) {
        if (r != 0) return false;
        if (n == 3) return true;
        return helper(n / 3, n % 3);
    }
}