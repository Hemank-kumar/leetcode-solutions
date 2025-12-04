/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
   let ans = new Array(2 * n);

    for (let i = 0; i < n; i++) {
        ans[2 * i] = nums[i];       // x1, x2, x3, ...
        ans[2 * i + 1] = nums[i+n]; // y1, y2, y3, ...
    }

    return ans;
};
