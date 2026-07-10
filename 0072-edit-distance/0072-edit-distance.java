class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(); int n = word2.length();
        int[][] op = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(op[i], -1);
        return helper(m - 1, n - 1, word1, word2, op);
    }
    private int helper(int i, int j, String word1, String word2, int[][] op) {
        if (i < 0) return j + 1;
        if (j < 0) return i + 1;
        if (op[i][j] != -1) return op[i][j];
        if (word1.charAt(i) == word2.charAt(j)) return op[i][j] = helper(i - 1, j - 1, word1, word2, op);
        else return op[i][j] = 1 + Math.min(helper(i - 1, j, word1, word2, op), Math.min(helper(i, j - 1, word1, word2, op), helper(i - 1, j - 1, word1, word2, op)));
    }
}