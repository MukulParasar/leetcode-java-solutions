class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (cols == 0){
            return false;
        }
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = (cols) / 2;
        while (rStart < (rEnd - 1)) {
            int rMid = rStart + (rEnd - rStart) / 2;
            if (target == matrix[rMid][cMid]) {
                return true;
            }
            if (target < matrix[rMid][cMid]) {
                rEnd = rMid;
            } else if (target > matrix[rMid][cMid]) {
                rStart = rMid;
            }
        }

        // Now, we have only 2 rows
        if (target == matrix[rStart][cMid]) {
            return true;
        }
        if (target == matrix[rEnd][cMid]) {
            return true;
        }
        // search in 4 parts
        if (cMid > 0 && target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (cMid < cols - 1 && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (cMid > 0 && target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][cMid] == target) {
                return true;
            }
            if (matrix[row][cMid] < target) {
                cStart = cMid + 1;
            } else {
                cEnd = cMid - 1;
            }
        }
        return false;
    }
}