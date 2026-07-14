/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    let min = Number.MAX_SAFE_INTEGER;
    for(let ele of nums){
        if(ele < min){
            min = ele;
        }
    }
    return min;
};
