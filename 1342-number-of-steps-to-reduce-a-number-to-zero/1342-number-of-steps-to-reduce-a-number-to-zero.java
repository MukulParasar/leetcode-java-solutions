class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    int helper(int num, int steps) {
        if (num == 0) return steps;
        if (num % 2 == 1) {
            num -= 1;
        } else {
            num /= 2;
        }
        steps++;
        return steps = helper(num, steps);
    }
}