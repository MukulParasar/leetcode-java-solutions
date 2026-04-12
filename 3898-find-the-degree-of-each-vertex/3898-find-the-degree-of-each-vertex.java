class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] vertDeg = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int degCount = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    degCount++;
                }
            }
            vertDeg[k] = degCount;
            k++;
        }
        return vertDeg;
    }
}