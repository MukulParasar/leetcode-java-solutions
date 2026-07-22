class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 1) return helper(n, 0);
        else return false;
    }
    private boolean helper(int n, int r) {
        if (n % 2 == 1) return false;
        if (n == 2 && r == 0) return true;
        if (n <= 1) return false;
        return helper(n / 2, n % 2);
    }
}