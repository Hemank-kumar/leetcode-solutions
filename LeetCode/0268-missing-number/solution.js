/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;
    let total = (n*(n+1))/2;
    let count = 0;
    for(let i = 0;i<n;i++){
        count += nums[i];
    }
    return total - count;
};
