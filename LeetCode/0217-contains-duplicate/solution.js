/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    nums.sort();
    const len = nums.length;
    for(let i = 1;i<len;i++){
        if(nums[i]==nums[i-1]){
            return true;
        }
    }
    return false;
};
