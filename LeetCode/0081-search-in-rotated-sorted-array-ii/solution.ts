function search(nums: number[], target: number): boolean {
    let left = 0;
        let right = nums.length-1;
        while(left <= right){
            let mid = left + Math.floor((right - left)/2);
            if(nums[mid] == target){
                return true;
            }
            if(nums[left] == nums[mid] && nums[right] == nums[mid]){
                left++;
                right--;
                continue;
            }
             if(nums[left] <= nums[mid]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return false;
};
