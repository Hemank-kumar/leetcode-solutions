class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Iterate through every row
        for (int r = 0; r < matrix.length; r++) {
            // Iterate through every column in the current row
            for (int c = 0; c < matrix[0].length; c++) {
                // If we find the target, return true immediately
                if (matrix[r][c] == target) {
                    return true;
                }
            }
        }
        
        // If we finish looping without finding it, return false
        return false;
    }
}
