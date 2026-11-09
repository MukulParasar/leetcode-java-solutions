class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if ((num & 1) == 0) {
            num /= 2;
        } else {
            num--;
        }
        steps++;
        return helper(num, steps);
    }
}