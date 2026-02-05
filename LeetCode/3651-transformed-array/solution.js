/**
 * @param {number[]} nums
 * @return {number[]}
 */
var constructTransformedArray = function(nums) {
    const n = nums.length;
    let result = [];
    for(let i = 0;i<n;i++){
        let newIndex = (i + nums[i])%n;
        if(newIndex < 0) { newIndex += n}
        result[i] = nums[newIndex];
    }
    return result;
};
