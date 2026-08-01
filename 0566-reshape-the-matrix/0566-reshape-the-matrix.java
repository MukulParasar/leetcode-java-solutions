class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length; int n = mat[0].length;
        if (m * n == r * c) {
            int i = 0, j = 0;   // mat
            int a = 0, b = 0;   // r, c
            int[][] newM = new int[r][c];
            while (i < m && a < r) {
                newM[a][b] = mat[i][j];
                j++;
                b++;
                if (j == n) {
                    i++;
                    j = 0;
                }
                if (b == c) {
                    a++;
                    b = 0;
                }
            }
            return newM;
        } else {
            return mat;
        }
    }
}