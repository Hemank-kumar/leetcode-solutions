function shuffle(nums: number[], n: number): number[] {
    const result : number[] = new Array(2*n);
    for(let i : number = 0;i<n;i++){
        result[i*2] = nums[i];
        result[i*2+1] = nums[i+n];
    }
    return result;
};
