/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let count = 0;
    let mCount = 0;
    for(let num of nums){
        if(num === 1){
            count++;
            mCount = Math.max(mCount, count);
        }else{
            count = 0;
        }
    }
    return mCount;
};
