class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0 || n == 2 || n == 3) return false;
        if (n == 1) return true;
        if (n % 4 == 0) return helper(n, 0);
        else return false;
    }
    private boolean helper(int n, int r) {
        if (r != 0) return false;
        if (n == 4) return true;
        return helper(n / 4, n % 4);
    }
}