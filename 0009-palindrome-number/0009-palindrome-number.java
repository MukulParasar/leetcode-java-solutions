class Solution {
    public boolean isPalindrome(int x) {
        int orig = x;
        if (x < 0) return false;
        if (x == 0) return true;
        int revX = 0;
        while (x > 0) {
            int rem = x % 10;
            x = x / 10;
            revX = revX * 10 + rem;
        }
        return revX == orig;
    }
}