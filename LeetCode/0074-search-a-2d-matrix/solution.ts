function searchMatrix(matrix: number[][], target: number): boolean {

        const n = matrix.length;
        const m = matrix[0].length;

        let left = 0;
        let right = m * n - 1;

        while(left <= right){

            const mid = Math.floor(left + (right - left) / 2);
            const midVal = matrix[Math.floor(mid / m)][Math.floor(mid % m)];

            if(midVal === target){
                return true;
            }
            if(midVal < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
};
