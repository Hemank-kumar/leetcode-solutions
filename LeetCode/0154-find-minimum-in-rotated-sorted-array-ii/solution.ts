function findMin(nums: number[]): number {
    let min = Number.MAX_SAFE_INTEGER;
    for(let ele of nums){
        if(ele < min){
            min = ele;
        }
    }
    return min;
};
