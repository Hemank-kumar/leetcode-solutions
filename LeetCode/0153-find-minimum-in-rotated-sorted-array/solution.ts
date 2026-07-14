function findMin(nums: number[]): number {
    nums.sort((a,b) => a-b);
    return nums[0];
};
