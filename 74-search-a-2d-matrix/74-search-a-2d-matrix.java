class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // check if matrix is null or empty and return false;
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        // find the row to search on
        int[] row = findRowToSearchOn(matrix, target);
        // if we do not find a row to search on this means that target is not in our matrix
        if (row.length == 0) {
            return false;
        }
        // do a binary search on the row that probably contains the target we are looking for
        int left = 0;
        int right = row.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int curr = row[mid];
            if (curr == target) {
                return true;
            }
            if (curr < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
    
    private int[] findRowToSearchOn(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int[] row = matrix[mid];
            int first = row[0];
            int last = row[row.length - 1];
            if (target >= first && target <= last) {
                return row;
            }
            if (target > first) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[0];
    }
}