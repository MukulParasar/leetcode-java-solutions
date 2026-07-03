class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(dp[i], -1);
        return count(m - 1, n - 1, dp);
    }
    int count(int i, int j, int[][] dp) {
        if (i == 0 && j == 0) return 1;
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] > 0) return dp[i][j];
        return dp[i][j] = count(i - 1, j, dp) + count(i, j - 1, dp);
    }
}