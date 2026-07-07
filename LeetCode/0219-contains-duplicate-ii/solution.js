/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
    const len = nums.length;
    let map = new Map();
    for(let i = 0;i<len;i++){
        let curVal= nums[i];
        if(map.has(curVal) && Math.abs(i-map.get(curVal)) <= k){
            return true;
        }
        map.set(curVal, i);
    }
    return false;
};
