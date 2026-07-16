class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        for(int i = 0;i<len;i++){
            int left = 0;
            int right = matrix[i].length-1;
            if((target < matrix[i][left]) || (target > matrix[i][right])){
                continue;
            }
            while(left <= right){
                int mid = left + (right - left)/2;
                if(matrix[i][mid] == target){
                    return true;
                }
                if(target < matrix[i][mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return false;
    }
}
