function checkXMatrix(grid: number[][]): boolean {
        const len = grid.length;
        for(let i=0;i<len; i++){
            for(let j=0;j<len;j++){
                const isDiagonal = i === j || i + j === len-1;
                if(isDiagonal){
                    if(grid[i][j] === 0)
                        return false;
                }
                else{
                    if(grid[i][j] !== 0){
                        return false;
                    }
                }
            }
        }
        return true;
};
