class Solution {
    public int countNegatives(int[][] grid) {
        int neg = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            int m = grid[i].length;
            int start = 0;
            int end = m - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (grid[i][mid] < 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (end >= 0 && grid[i][end] < 0) {
                neg += m - end;
            } else if (start < m && grid[i][start] < 0) {
                neg += m - start;
            }
        }
        return neg;
    }
}