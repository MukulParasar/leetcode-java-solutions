class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int digitSum = 0; int digitProduct = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            digitSum += lastDigit;
            System.out.print(digitSum + " ");
            digitProduct *= lastDigit;
            System.out.print(digitProduct);
            n /= 10;
            System.out.println();
        }
        int sum = digitSum + digitProduct;
        System.out.println(sum);
        return x % sum == 0;
    }
}