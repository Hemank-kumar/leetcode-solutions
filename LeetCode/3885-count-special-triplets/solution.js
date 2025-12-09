/**
 * @param {number[]} nums
 * @return {number}
 */
var specialTriplets = function (nums) {
  const MOD = 1000000007;

  // 'left' will count how many times each number appeared before the current index
  let left = {};
  // 'right' will count how many times each number appears after the current index
  let right = {};

  // Initially, all numbers are in the 'right' object
  for (let x of nums) {
    right[x] = (right[x] || 0) + 1;
  }

  let result = 0;

  // Iterate through the array treating each element as the middle of a triplet (nums[j])
  for (let j = 0; j < nums.length; j++) {
    let mid = nums[j];

    // Move current element from 'right' to 'left'
    // Because now it's part of the "seen" numbers before future j's
    right[mid]--;

    // The number we want on left and right of j is exactly 2 * mid
    let target = mid * 2;

    // How many times target appears on the left of j
    let leftCount = left[target] || 0;
    // How many times target appears on the right of j
    let rightCount = right[target] || 0;

    // Every combination of a left target and right target with this middle forms a special triplet
    result += leftCount * rightCount;

    // Add the current number to the left count for future iterations
    left[mid] = (left[mid] || 0) + 1;
  }

  return result % MOD;
};
