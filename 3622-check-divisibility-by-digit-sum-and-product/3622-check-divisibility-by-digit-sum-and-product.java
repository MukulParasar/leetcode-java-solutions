class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int digitSum = 0; int digitProduct = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            digitSum += lastDigit;
            digitProduct *= lastDigit;
            n /= 10;
        }
        int sum = digitSum + digitProduct;
        return x % sum == 0;
    }
}