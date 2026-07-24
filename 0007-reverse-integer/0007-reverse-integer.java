class Solution {
    public int reverse(int x) {
        long rev = 0L;
        while (x != 0) {
            long rem = (long) x % 10;
            rev = (long) (rev * 10 + rem);
            x /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) rev;
        }
    }
}

// -2147483648 to 2147483647