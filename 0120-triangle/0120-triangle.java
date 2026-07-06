class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < triangle.get(i).size()) {
                    if (i == 0) {
                        dp[i][j] = triangle.get(i).get(j);
                    } else {
                        if (j > 0) dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
                        else dp[i][j] = triangle.get(i).get(j) + dp[i - 1][j];
                    }
                }
            }
        }
        int min = Integer.MAX_VALUE;
        int i = n - 1;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, dp[i][j]);
        }
        return min;
    }
}