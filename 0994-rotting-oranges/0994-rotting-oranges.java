class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length; int m = grid[0].length;
        int isFresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) q.add(new int[]{i, j});
                if (grid[i][j] == 1) isFresh++;
            }
        }
        if (isFresh == 0) return 0;
        int mins = 0;
        while(!q.isEmpty()) {
            boolean isRotten = false;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int row = curr[0]; int col = curr[1];
                int[] dR = {-1, 1, 0, 0}; int[] dC = {0, 0, -1, 1};
                for (int j = 0; j < 4; j++) {
                    int newRow = row + dR[j];
                    int newCol = col + dC[j];
                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        q.add(new int[]{newRow, newCol});
                        isFresh--;
                        isRotten = true;
                    }
                }
            }
            if (isRotten) mins++;
        }
        if (isFresh > 0) return -1;
        else return mins;
    }
}