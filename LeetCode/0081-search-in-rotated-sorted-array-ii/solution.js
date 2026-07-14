/**
 * @param {number[]} nums
 * @param {number} target
 * @return {boolean}
 */
var search = function(nums, target) {
     for(let ele of nums){
            if(ele == target){
                return true;
            }
        }
        return false;
};
