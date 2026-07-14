/**
 * @param {number[]} nums
 * @return {number}
 */
var findMin = function(nums) {
    return search(nums,0,nums.length-1);
};
function search(nums, left , right){
    if(left == right){
        return nums[left];
    }
    let mid = left + Math.floor((right - left) / 2);
    if(nums[mid] > nums[right]){
        return search(nums,mid + 1,right);
    }else{
        return search(nums,left,mid);
    }
}
